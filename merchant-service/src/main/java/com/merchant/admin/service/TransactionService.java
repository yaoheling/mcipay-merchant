package com.merchant.admin.service;

import com.mcipay.persistence.entity.MerchantAccountEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.mcipay.persistence.entity.PaymentJournalEntity;
import com.mcipay.persistence.mapper.MerchantAccountEntityMapper;
import com.mcipay.persistence.mapper.MerchantInfoEntityMapper;
import com.mcipay.persistence.mapper.MerchantTransactionEntityMapper;
import com.mcipay.persistence.mapper.PaymentJournalEntityMapper;
import com.merchant.admin.bo.MerchantTransactionRequest;
import com.merchant.util.BaseResponse;
import com.merchant.util.PaymentStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@Service
public class TransactionService {

    @Resource(name = "merchantTransactionEntityMapper")
    private MerchantTransactionEntityMapper merchantTransactionMapper;

    @Resource(name = "merchantAccountEntityMapper")
    private MerchantAccountEntityMapper merchantAccountMapper;

    @Resource(name = "paymentJournalEntityMapper")
    private PaymentJournalEntityMapper paymentJournalMapper;

    @Resource(name = "merchantInfoEntityMapper")
    private MerchantInfoEntityMapper merchantInfoMapper;

    @Autowired
    private PaymentService paymentService;

    /**
     * 商户交易代理
     */
    @Transactional
    public BaseResponse transactionAgent(MerchantTransactionRequest request) {
        BaseResponse response = new BaseResponse();
        MerchantInfoEntity merchantInfoEntity = merchantInfoMapper.selectByPrimaryKey(request.getMerchantId());
        if(merchantInfoEntity == null) {
            response.error();
            response.setMessage("商户ID不存在, 请检查商户信息");
            return response;
        }
        // 交易主表数据入库
        MerchantTransactionEntity transaction = new MerchantTransactionEntity();
        BeanUtils.copyProperties(request, transaction);
        merchantTransactionMapper.insert(transaction);

        BigDecimal rmbAmount = request.getMerchantCnyAmount();
        BigDecimal serviceAmount = getServiceAmount(rmbAmount);
        BigDecimal depositAmount = getDepositAmount(rmbAmount);
        BigDecimal settleAmount = rmbAmount.subtract(serviceAmount).subtract(depositAmount);
        BigDecimal spreadsAmount = getSpreadsAmount(rmbAmount);
        BigDecimal actualAmount = rmbAmount.add(spreadsAmount);
        // 商户账目表
        MerchantAccountEntity account = new MerchantAccountEntity();
        account.setMerchantTransactionId(transaction.getId());
        account.setMerchantCurrency(request.getMerchantCurrency());
        account.setRequestAmount(rmbAmount);
        account.setMerchantServiceAmount(serviceAmount);
        account.setMerchantDepositAmount(depositAmount);
        account.setMerchantSettleAmount(settleAmount);
        account.setManagementSpreadsAmount(spreadsAmount);
        account.setActualAmount(actualAmount);
        merchantAccountMapper.insert(account);

        // 支付流水表
        PaymentJournalEntity paymentJournal = new PaymentJournalEntity();
        paymentJournal.setMerchantTransactionId(transaction.getId());
        paymentJournal.setManagementTransAmount(actualAmount);
        paymentJournal.setMerchantTransactionId(transaction.getId());
        paymentJournal.setUserCardNumber(request.getUserCardNumber());
        paymentJournal.setTransQueryCount(1);
        paymentJournal.setTransStatus(PaymentStatus.PROCESSING.getStatus());
        paymentJournal.setTransModifyTime(new Date());
        paymentJournalMapper.insert(paymentJournal);

        // 三方支付请求
        paymentService.payment(paymentJournal);
        response.success();
        return response;
    }

    /**
     * 服务费
     */
    private BigDecimal getServiceAmount(BigDecimal rmbAmount) {
        return rmbAmount.multiply(new BigDecimal(5)).divide(new BigDecimal(100));
    }

    /**
     * 保证金
     */
    private BigDecimal getDepositAmount(BigDecimal rmbAmount) {
        return rmbAmount.multiply(new BigDecimal(4)).divide(new BigDecimal(100));
    }

    /**
     * 管理平台利率差
     */
    private BigDecimal getSpreadsAmount(BigDecimal rmbAmount) {
        return rmbAmount.multiply(new BigDecimal(3)).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
    }

}

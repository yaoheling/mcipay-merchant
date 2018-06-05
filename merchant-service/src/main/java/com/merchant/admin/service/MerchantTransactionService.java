package com.merchant.admin.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.mcipay.persistence.entity.MerchantTransactionEntityCriteria;
import com.mcipay.persistence.mapper.MerchantTransactionEntityMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/05
 **/
@Service
public class MerchantTransactionService {

    @Autowired
    private MerchantTransactionEntityMapper merchantTransactionEntityMapper;

    /**
     * 交易查询
     * @param page
     * @param entity
     * @return
     */
    public List<MerchantTransactionEntity> getList(Page page, MerchantTransactionEntity entity) {
        MerchantTransactionEntityCriteria criteria = new MerchantTransactionEntityCriteria();
        MerchantTransactionEntityCriteria.Criteria query = criteria.or();
        criteria.setPage(page);
        if (entity.getPaymentTransStatus() != null) {
            query.andPaymentTransStatusEqualTo(entity.getPaymentTransStatus());
        }
        if (entity.getSettlementStatus() != null) {
            query.andSettlementStatusEqualTo(entity.getSettlementStatus());
        }
        if (StringUtils.isNotBlank(entity.getMerchantCardType())) {
            query.andMerchantCardTypeEqualTo(entity.getMerchantCardType());
        }
        criteria.setOrderByClause(" id desc ");
        merchantTransactionEntityMapper.selectByExample(criteria);
    }
}

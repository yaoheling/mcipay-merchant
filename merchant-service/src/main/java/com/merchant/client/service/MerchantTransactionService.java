package com.merchant.client.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.mcipay.persistence.entity.MerchantTransactionEntityCriteria;
import com.mcipay.persistence.mapper.MerchantTransactionEntityMapper;
import com.merchant.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/05
 **/
@Service
public class MerchantTransactionService {

    @Resource
    private MerchantTransactionEntityMapper merchantTransactionEntityMapper;

    /**
     * 交易查询
     * @param page
     * @param entity
     * @return
     */
    public List<MerchantTransactionEntity> getList(Page page, MerchantTransactionEntity entity,
                                                   String startTime, String endTime) {
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
        if (StringUtils.isNotBlank(startTime)) {
            query.andManagementTransTimeGreaterThanOrEqualTo(DateUtils.stringToDate(startTime, DateUtils.FORMAT_YYYY_MM_DD));
        }
        if (StringUtils.isNotBlank(endTime)) {
            query.andManagementTransTimeLessThanOrEqualTo(DateUtils.getSpecificTime(endTime, 1));
        }
        criteria.setOrderByClause(" id desc ");
        return merchantTransactionEntityMapper.selectByExample(criteria);
    }
}

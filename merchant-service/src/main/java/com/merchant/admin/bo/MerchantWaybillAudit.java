package com.merchant.admin.bo;

import com.mcipay.persistence.entity.MerchantTransactionEntity;

import java.util.Date;

public class MerchantWaybillAudit extends MerchantTransactionEntity {

    private String waybillNo;

    private Date merchantCommitTime;

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public Date getMerchantCommitTime() {
        return merchantCommitTime;
    }

    public void setMerchantCommitTime(Date merchantCommitTime) {
        this.merchantCommitTime = merchantCommitTime;
    }

}

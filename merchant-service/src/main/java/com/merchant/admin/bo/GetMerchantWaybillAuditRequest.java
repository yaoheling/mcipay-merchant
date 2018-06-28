package com.merchant.admin.bo;

import com.merchant.util.QueryRequest;

import java.util.Date;

public class GetMerchantWaybillAuditRequest extends QueryRequest {

    private Integer merchantTransactionId;

    private Integer waybillStatus;

    private Date merchantCreateTimeStart;
    private Date merchantCreateTimeEnd;

    public Integer getMerchantTransactionId() {
        return merchantTransactionId;
    }

    public void setMerchantTransactionId(Integer merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Date getMerchantCreateTimeStart() {
        return merchantCreateTimeStart;
    }

    public void setMerchantCreateTimeStart(Date merchantCreateTimeStart) {
        this.merchantCreateTimeStart = merchantCreateTimeStart;
    }

    public Date getMerchantCreateTimeEnd() {
        return merchantCreateTimeEnd;
    }

    public void setMerchantCreateTimeEnd(Date merchantCreateTimeEnd) {
        this.merchantCreateTimeEnd = merchantCreateTimeEnd;
    }
}

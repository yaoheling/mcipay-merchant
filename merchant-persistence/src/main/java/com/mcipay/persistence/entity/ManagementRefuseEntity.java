package com.mcipay.persistence.entity;

import java.util.Date;

public class ManagementRefuseEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private Integer transStatus;

    private String refuseOperator;

    private Date refuseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantTransactionId() {
        return merchantTransactionId;
    }

    public void setMerchantTransactionId(Integer merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public String getRefuseOperator() {
        return refuseOperator;
    }

    public void setRefuseOperator(String refuseOperator) {
        this.refuseOperator = refuseOperator == null ? null : refuseOperator.trim();
    }

    public Date getRefuseTime() {
        return refuseTime;
    }

    public void setRefuseTime(Date refuseTime) {
        this.refuseTime = refuseTime;
    }
}
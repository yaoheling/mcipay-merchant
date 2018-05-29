package com.mcipay.persistence.entity;

import java.util.Date;

public class PaymentJournalEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private String userCardNumber;

    private Long merchantCnyAmount;

    private Long managementTransAmount;

    private Long managementServiceCharge;

    private Integer transStatus;

    private Integer transQueryCount;

    private Date transModifyTime;

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

    public String getUserCardNumber() {
        return userCardNumber;
    }

    public void setUserCardNumber(String userCardNumber) {
        this.userCardNumber = userCardNumber == null ? null : userCardNumber.trim();
    }

    public Long getMerchantCnyAmount() {
        return merchantCnyAmount;
    }

    public void setMerchantCnyAmount(Long merchantCnyAmount) {
        this.merchantCnyAmount = merchantCnyAmount;
    }

    public Long getManagementTransAmount() {
        return managementTransAmount;
    }

    public void setManagementTransAmount(Long managementTransAmount) {
        this.managementTransAmount = managementTransAmount;
    }

    public Long getManagementServiceCharge() {
        return managementServiceCharge;
    }

    public void setManagementServiceCharge(Long managementServiceCharge) {
        this.managementServiceCharge = managementServiceCharge;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public Integer getTransQueryCount() {
        return transQueryCount;
    }

    public void setTransQueryCount(Integer transQueryCount) {
        this.transQueryCount = transQueryCount;
    }

    public Date getTransModifyTime() {
        return transModifyTime;
    }

    public void setTransModifyTime(Date transModifyTime) {
        this.transModifyTime = transModifyTime;
    }
}
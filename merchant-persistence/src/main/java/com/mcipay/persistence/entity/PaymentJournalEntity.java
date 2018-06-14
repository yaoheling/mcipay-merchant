package com.mcipay.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentJournalEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private String userCardNumber;

    private BigDecimal managementTransAmount;

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

    public BigDecimal getManagementTransAmount() {
        return managementTransAmount;
    }

    public void setManagementTransAmount(BigDecimal managementTransAmount) {
        this.managementTransAmount = managementTransAmount;
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
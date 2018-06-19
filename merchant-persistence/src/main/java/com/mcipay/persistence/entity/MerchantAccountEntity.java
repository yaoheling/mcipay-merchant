package com.mcipay.persistence.entity;

import java.math.BigDecimal;

public class MerchantAccountEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private String merchantCurrency;

    private BigDecimal requestAmount;

    private BigDecimal merchantServiceAmount;

    private BigDecimal merchantDepositAmount;

    private BigDecimal merchantSettleAmount;

    private BigDecimal managementSpreadsAmount;

    private BigDecimal actualAmount;

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

    public String getMerchantCurrency() {
        return merchantCurrency;
    }

    public void setMerchantCurrency(String merchantCurrency) {
        this.merchantCurrency = merchantCurrency == null ? null : merchantCurrency.trim();
    }

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }

    public BigDecimal getMerchantServiceAmount() {
        return merchantServiceAmount;
    }

    public void setMerchantServiceAmount(BigDecimal merchantServiceAmount) {
        this.merchantServiceAmount = merchantServiceAmount;
    }

    public BigDecimal getMerchantDepositAmount() {
        return merchantDepositAmount;
    }

    public void setMerchantDepositAmount(BigDecimal merchantDepositAmount) {
        this.merchantDepositAmount = merchantDepositAmount;
    }

    public BigDecimal getMerchantSettleAmount() {
        return merchantSettleAmount;
    }

    public void setMerchantSettleAmount(BigDecimal merchantSettleAmount) {
        this.merchantSettleAmount = merchantSettleAmount;
    }

    public BigDecimal getManagementSpreadsAmount() {
        return managementSpreadsAmount;
    }

    public void setManagementSpreadsAmount(BigDecimal managementSpreadsAmount) {
        this.managementSpreadsAmount = managementSpreadsAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }
}
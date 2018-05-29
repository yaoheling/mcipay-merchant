package com.mcipay.persistence.entity;

import java.util.Date;

public class MerchantTransactionEntity {
    private Integer id;

    private String merchantId;

    private String merchantSerialNo;

    private String merchantOrderNo;

    private Date merchantCreateTime;

    private Date managementTransTime;

    private String merchantCurrency;

    private String merchantCardType;

    private Long merchantForeignAmount;

    private Long merchantCnyAmount;

    private String userEmail;

    private String userTransUrl;

    private Integer paymentTransStatus;

    private Integer settlementStatus;

    private Integer waybillStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantSerialNo() {
        return merchantSerialNo;
    }

    public void setMerchantSerialNo(String merchantSerialNo) {
        this.merchantSerialNo = merchantSerialNo == null ? null : merchantSerialNo.trim();
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    public Date getMerchantCreateTime() {
        return merchantCreateTime;
    }

    public void setMerchantCreateTime(Date merchantCreateTime) {
        this.merchantCreateTime = merchantCreateTime;
    }

    public Date getManagementTransTime() {
        return managementTransTime;
    }

    public void setManagementTransTime(Date managementTransTime) {
        this.managementTransTime = managementTransTime;
    }

    public String getMerchantCurrency() {
        return merchantCurrency;
    }

    public void setMerchantCurrency(String merchantCurrency) {
        this.merchantCurrency = merchantCurrency == null ? null : merchantCurrency.trim();
    }

    public String getMerchantCardType() {
        return merchantCardType;
    }

    public void setMerchantCardType(String merchantCardType) {
        this.merchantCardType = merchantCardType == null ? null : merchantCardType.trim();
    }

    public Long getMerchantForeignAmount() {
        return merchantForeignAmount;
    }

    public void setMerchantForeignAmount(Long merchantForeignAmount) {
        this.merchantForeignAmount = merchantForeignAmount;
    }

    public Long getMerchantCnyAmount() {
        return merchantCnyAmount;
    }

    public void setMerchantCnyAmount(Long merchantCnyAmount) {
        this.merchantCnyAmount = merchantCnyAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserTransUrl() {
        return userTransUrl;
    }

    public void setUserTransUrl(String userTransUrl) {
        this.userTransUrl = userTransUrl == null ? null : userTransUrl.trim();
    }

    public Integer getPaymentTransStatus() {
        return paymentTransStatus;
    }

    public void setPaymentTransStatus(Integer paymentTransStatus) {
        this.paymentTransStatus = paymentTransStatus;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }
}
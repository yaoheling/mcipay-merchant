package com.merchant.admin.bo;

import com.merchant.util.PaymentServiceStatus;
import com.merchant.util.PaymentStatus;
import com.merchant.util.SettlementStatus;
import com.merchant.util.WaybillStatus;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class MerchantTransactionRequest {

    @NotNull(message = "商户ID 不能为空")
    private Integer merchantId;

    @NotNull(message = "流水号 不能为空")
    private String merchantSerialNo;

    @NotNull(message = "订单号 不能为空")
    private String merchantOrderNo;

    private Date merchantCreateTime;

    private Date managementTransTime = new Date();

    private String merchantCurrency;

    private String merchantCardType;

    private BigDecimal merchantForeignAmount;

    @NotNull(message = "支付人民币金额 不能为空")
    private BigDecimal merchantCnyAmount;

    private String userEmail;

    private String userTransUrl;

    private Integer paymentTransStatus = PaymentStatus.INIT.getStatus();

    private Integer paymentServiceStatus = PaymentServiceStatus.INIT.getStatus();

    private Integer settlementStatus = SettlementStatus.INIT.getStatus();

    private Integer waybillStatus = WaybillStatus.INIT.getStatus();

    //TODO 外币卡境内代扣所需要素
    private String userCardNumber;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantSerialNo() {
        return merchantSerialNo;
    }

    public void setMerchantSerialNo(String merchantSerialNo) {
        this.merchantSerialNo = merchantSerialNo;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
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
        this.merchantCurrency = merchantCurrency;
    }

    public String getMerchantCardType() {
        return merchantCardType;
    }

    public void setMerchantCardType(String merchantCardType) {
        this.merchantCardType = merchantCardType;
    }

    public BigDecimal getMerchantForeignAmount() {
        return merchantForeignAmount;
    }

    public void setMerchantForeignAmount(BigDecimal merchantForeignAmount) {
        this.merchantForeignAmount = merchantForeignAmount;
    }

    public BigDecimal getMerchantCnyAmount() {
        return merchantCnyAmount;
    }

    public void setMerchantCnyAmount(BigDecimal merchantCnyAmount) {
        this.merchantCnyAmount = merchantCnyAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTransUrl() {
        return userTransUrl;
    }

    public void setUserTransUrl(String userTransUrl) {
        this.userTransUrl = userTransUrl;
    }

    public Integer getPaymentTransStatus() {
        return paymentTransStatus;
    }

    public void setPaymentTransStatus(Integer paymentTransStatus) {
        this.paymentTransStatus = paymentTransStatus;
    }

    public Integer getPaymentServiceStatus() {
        return paymentServiceStatus;
    }

    public void setPaymentServiceStatus(Integer paymentServiceStatus) {
        this.paymentServiceStatus = paymentServiceStatus;
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

    public String getUserCardNumber() {
        return userCardNumber;
    }

    public void setUserCardNumber(String userCardNumber) {
        this.userCardNumber = userCardNumber;
    }
}

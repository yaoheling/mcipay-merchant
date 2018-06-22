package com.merchant.admin.bo;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class MerchantServiceCharge {

    @NotNull(message = "merchantId 不能为空")
    private Integer merchantId;

    @NotNull(message = "cardType 不能为空")
    private String cardType;

    @NotNull(message = "serviceCharge 不能为空")
    private BigDecimal serviceCharge;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
}
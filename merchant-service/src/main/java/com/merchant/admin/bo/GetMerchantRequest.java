package com.merchant.admin.bo;

import com.merchant.util.QueryRequest;

public class GetMerchantRequest extends QueryRequest {

    private Integer merchantId;

    private String merchantNameKey;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantNameKey() {
        return merchantNameKey;
    }

    public void setMerchantNameKey(String merchantNameKey) {
        this.merchantNameKey = merchantNameKey;
    }
}

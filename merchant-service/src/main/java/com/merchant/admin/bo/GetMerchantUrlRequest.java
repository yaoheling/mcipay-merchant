package com.merchant.admin.bo;

import com.merchant.util.QueryRequest;

public class GetMerchantUrlRequest extends QueryRequest {

    private Integer merchantId;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

}

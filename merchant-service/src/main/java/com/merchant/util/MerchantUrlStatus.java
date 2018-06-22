package com.merchant.util;

/**
 * URL审核状态 0：提交待审核(默认)；1：审核通过；2：驳回
 */
public enum MerchantUrlStatus {

    INIT(0, "提交待审核(默认)"),
    PASS(1, "审核通过"),
    REJECT(2, "驳回");

    private Integer status;
    private String description;

    MerchantUrlStatus(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public static MerchantUrlStatus getMerchantUrlStatus(Integer status) {
        if(status == null) {
            return null;
        }
        MerchantUrlStatus[] values = values();
        for (int i = 0; i < values.length; i++) {
            if(status.equals(values[i].getStatus())) {
                return values[i];
            }
        }
        return null;
    }

}

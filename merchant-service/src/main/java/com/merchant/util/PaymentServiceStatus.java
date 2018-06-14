package com.merchant.util;

public enum PaymentServiceStatus {

    INIT(0, "正常状态（默认）"),
    REFUSE(1, "拒付"),
    REFUND(2, "退款");

    private Integer status;
    private String description;

    PaymentServiceStatus(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

}

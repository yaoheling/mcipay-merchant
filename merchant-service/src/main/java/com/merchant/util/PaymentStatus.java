package com.merchant.util;

/**
 * 三方支付交易状态 三方交易状态
 */
public enum PaymentStatus {

    INIT(-2, "支付未发起（默认）"),
    ERROR(-1, "失败"),
    PROCESSING(0, "处理中"),
    SUCCESS(1, "成功");

    private Integer status;
    private String description;

    PaymentStatus(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

}

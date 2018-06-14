package com.merchant.util;

/**
 * 结算状态  0：未结算（默认）；-1：结算审核中；1：已结算；2：驳回
 */
public enum SettlementStatus {

    INIT(0, "未结算（默认）"),
    AUDITING(-1, "结算审核中"),
    PASS(1, "已结算"),
    REJECT(2, "驳回");

    private Integer status;
    private String description;

    SettlementStatus(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

}

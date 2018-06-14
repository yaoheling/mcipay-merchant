package com.merchant.util;

/**
 * 运单状态  -1：待审核；0：运单未提交（默认）；1：通过；2：驳回
 */
public enum WaybillStatus {

    INIT(0, "运单未提交（默认）"),
    AUDITING(-1, "运单审核中"),
    PASS(1, "通过"),
    REJECT(2, "驳回");

    private Integer status;
    private String description;

    WaybillStatus(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

}

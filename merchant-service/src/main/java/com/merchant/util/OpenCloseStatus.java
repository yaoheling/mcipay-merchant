package com.merchant.util;

public enum OpenCloseStatus {

    CLOSE(0, "禁用"),
    OPEN(1, "启用");

    private Integer status;
    private String desc;

    OpenCloseStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public static OpenCloseStatus getOpenCloseStatus(Integer status) {
        if(status == null) {
            return null;
        }
        OpenCloseStatus[] values = values();
        for (OpenCloseStatus oc: values) {
            if(oc.getStatus().equals(status)) {
                return oc;
            }
        }
        return null;
    }

}

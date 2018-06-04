package com.merchant.util;

public class BaseQueryRequest {

    // 第几页 起始页 1
    private Integer pageNo;

    // 每页条数
    private Integer pageSize;

    public int getSqlStart() {
        return (pageNo - 1) * pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }
}

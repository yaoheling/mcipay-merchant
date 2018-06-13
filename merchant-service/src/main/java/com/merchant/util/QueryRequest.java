package com.merchant.util;

public class QueryRequest {

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

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}

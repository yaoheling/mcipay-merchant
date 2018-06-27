package com.merchant.util;

import java.util.Collection;

public class QueryResponse {

    private long totalCount;
    private Collection rows;

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Collection getRows() {
        return rows;
    }

    public void setRows(Collection rows) {
        this.rows = rows;
    }
}

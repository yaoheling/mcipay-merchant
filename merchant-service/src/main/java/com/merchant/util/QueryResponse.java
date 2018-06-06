package com.merchant.util;

import java.util.Collection;

public class QueryResponse {

    private int totalCount;
    private Collection rows;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Collection getRows() {
        return rows;
    }

    public void setRows(Collection rows) {
        this.rows = rows;
    }
}

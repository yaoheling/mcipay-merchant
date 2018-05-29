package com.mcipay.persistence.entity;

import java.util.Date;

public class MerchantSettlementEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private Integer settlementStatus;

    private String settlementApplyOperator;

    private Date settlementApplyTime;

    private String managementAuditor;

    private Byte managementAuditResult;

    private Date managementAuditTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantTransactionId() {
        return merchantTransactionId;
    }

    public void setMerchantTransactionId(Integer merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getSettlementApplyOperator() {
        return settlementApplyOperator;
    }

    public void setSettlementApplyOperator(String settlementApplyOperator) {
        this.settlementApplyOperator = settlementApplyOperator == null ? null : settlementApplyOperator.trim();
    }

    public Date getSettlementApplyTime() {
        return settlementApplyTime;
    }

    public void setSettlementApplyTime(Date settlementApplyTime) {
        this.settlementApplyTime = settlementApplyTime;
    }

    public String getManagementAuditor() {
        return managementAuditor;
    }

    public void setManagementAuditor(String managementAuditor) {
        this.managementAuditor = managementAuditor == null ? null : managementAuditor.trim();
    }

    public Byte getManagementAuditResult() {
        return managementAuditResult;
    }

    public void setManagementAuditResult(Byte managementAuditResult) {
        this.managementAuditResult = managementAuditResult;
    }

    public Date getManagementAuditTime() {
        return managementAuditTime;
    }

    public void setManagementAuditTime(Date managementAuditTime) {
        this.managementAuditTime = managementAuditTime;
    }
}
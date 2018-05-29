package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantSettlementEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MerchantSettlementEntityCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdIsNull() {
            addCriterion("merchant_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdIsNotNull() {
            addCriterion("merchant_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdEqualTo(Integer value) {
            addCriterion("merchant_transaction_id =", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdNotEqualTo(Integer value) {
            addCriterion("merchant_transaction_id <>", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdGreaterThan(Integer value) {
            addCriterion("merchant_transaction_id >", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_transaction_id >=", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdLessThan(Integer value) {
            addCriterion("merchant_transaction_id <", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_transaction_id <=", value, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdIn(List<Integer> values) {
            addCriterion("merchant_transaction_id in", values, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdNotIn(List<Integer> values) {
            addCriterion("merchant_transaction_id not in", values, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_transaction_id between", value1, value2, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andMerchantTransactionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_transaction_id not between", value1, value2, "merchantTransactionId");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNull() {
            addCriterion("settlement_status is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIsNotNull() {
            addCriterion("settlement_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusEqualTo(Integer value) {
            addCriterion("settlement_status =", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotEqualTo(Integer value) {
            addCriterion("settlement_status <>", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThan(Integer value) {
            addCriterion("settlement_status >", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_status >=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThan(Integer value) {
            addCriterion("settlement_status <", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_status <=", value, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusIn(List<Integer> values) {
            addCriterion("settlement_status in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotIn(List<Integer> values) {
            addCriterion("settlement_status not in", values, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_status not between", value1, value2, "settlementStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorIsNull() {
            addCriterion("settlement_apply_operator is null");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorIsNotNull() {
            addCriterion("settlement_apply_operator is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorEqualTo(String value) {
            addCriterion("settlement_apply_operator =", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorNotEqualTo(String value) {
            addCriterion("settlement_apply_operator <>", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorGreaterThan(String value) {
            addCriterion("settlement_apply_operator >", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_apply_operator >=", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorLessThan(String value) {
            addCriterion("settlement_apply_operator <", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorLessThanOrEqualTo(String value) {
            addCriterion("settlement_apply_operator <=", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorLike(String value) {
            addCriterion("settlement_apply_operator like", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorNotLike(String value) {
            addCriterion("settlement_apply_operator not like", value, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorIn(List<String> values) {
            addCriterion("settlement_apply_operator in", values, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorNotIn(List<String> values) {
            addCriterion("settlement_apply_operator not in", values, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorBetween(String value1, String value2) {
            addCriterion("settlement_apply_operator between", value1, value2, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyOperatorNotBetween(String value1, String value2) {
            addCriterion("settlement_apply_operator not between", value1, value2, "settlementApplyOperator");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeIsNull() {
            addCriterion("settlement_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeIsNotNull() {
            addCriterion("settlement_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeEqualTo(Date value) {
            addCriterion("settlement_apply_time =", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeNotEqualTo(Date value) {
            addCriterion("settlement_apply_time <>", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeGreaterThan(Date value) {
            addCriterion("settlement_apply_time >", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_apply_time >=", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeLessThan(Date value) {
            addCriterion("settlement_apply_time <", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_apply_time <=", value, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeIn(List<Date> values) {
            addCriterion("settlement_apply_time in", values, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeNotIn(List<Date> values) {
            addCriterion("settlement_apply_time not in", values, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_apply_time between", value1, value2, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andSettlementApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_apply_time not between", value1, value2, "settlementApplyTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorIsNull() {
            addCriterion("management_auditor is null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorIsNotNull() {
            addCriterion("management_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorEqualTo(String value) {
            addCriterion("management_auditor =", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorNotEqualTo(String value) {
            addCriterion("management_auditor <>", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorGreaterThan(String value) {
            addCriterion("management_auditor >", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("management_auditor >=", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorLessThan(String value) {
            addCriterion("management_auditor <", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorLessThanOrEqualTo(String value) {
            addCriterion("management_auditor <=", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorLike(String value) {
            addCriterion("management_auditor like", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorNotLike(String value) {
            addCriterion("management_auditor not like", value, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorIn(List<String> values) {
            addCriterion("management_auditor in", values, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorNotIn(List<String> values) {
            addCriterion("management_auditor not in", values, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorBetween(String value1, String value2) {
            addCriterion("management_auditor between", value1, value2, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditorNotBetween(String value1, String value2) {
            addCriterion("management_auditor not between", value1, value2, "managementAuditor");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultIsNull() {
            addCriterion("management_audit_result is null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultIsNotNull() {
            addCriterion("management_audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultEqualTo(Byte value) {
            addCriterion("management_audit_result =", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultNotEqualTo(Byte value) {
            addCriterion("management_audit_result <>", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultGreaterThan(Byte value) {
            addCriterion("management_audit_result >", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("management_audit_result >=", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultLessThan(Byte value) {
            addCriterion("management_audit_result <", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultLessThanOrEqualTo(Byte value) {
            addCriterion("management_audit_result <=", value, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultIn(List<Byte> values) {
            addCriterion("management_audit_result in", values, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultNotIn(List<Byte> values) {
            addCriterion("management_audit_result not in", values, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultBetween(Byte value1, Byte value2) {
            addCriterion("management_audit_result between", value1, value2, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditResultNotBetween(Byte value1, Byte value2) {
            addCriterion("management_audit_result not between", value1, value2, "managementAuditResult");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeIsNull() {
            addCriterion("management_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeIsNotNull() {
            addCriterion("management_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeEqualTo(Date value) {
            addCriterion("management_audit_time =", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeNotEqualTo(Date value) {
            addCriterion("management_audit_time <>", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeGreaterThan(Date value) {
            addCriterion("management_audit_time >", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("management_audit_time >=", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeLessThan(Date value) {
            addCriterion("management_audit_time <", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("management_audit_time <=", value, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeIn(List<Date> values) {
            addCriterion("management_audit_time in", values, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeNotIn(List<Date> values) {
            addCriterion("management_audit_time not in", values, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeBetween(Date value1, Date value2) {
            addCriterion("management_audit_time between", value1, value2, "managementAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagementAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("management_audit_time not between", value1, value2, "managementAuditTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
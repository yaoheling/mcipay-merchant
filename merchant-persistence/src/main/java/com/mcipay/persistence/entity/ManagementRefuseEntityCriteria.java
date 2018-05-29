package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagementRefuseEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ManagementRefuseEntityCriteria() {
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

        public Criteria andTransStatusIsNull() {
            addCriterion("trans_status is null");
            return (Criteria) this;
        }

        public Criteria andTransStatusIsNotNull() {
            addCriterion("trans_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransStatusEqualTo(Integer value) {
            addCriterion("trans_status =", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotEqualTo(Integer value) {
            addCriterion("trans_status <>", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThan(Integer value) {
            addCriterion("trans_status >", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_status >=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThan(Integer value) {
            addCriterion("trans_status <", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trans_status <=", value, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusIn(List<Integer> values) {
            addCriterion("trans_status in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotIn(List<Integer> values) {
            addCriterion("trans_status not in", values, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusBetween(Integer value1, Integer value2) {
            addCriterion("trans_status between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andTransStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_status not between", value1, value2, "transStatus");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorIsNull() {
            addCriterion("refuse_operator is null");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorIsNotNull() {
            addCriterion("refuse_operator is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorEqualTo(String value) {
            addCriterion("refuse_operator =", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorNotEqualTo(String value) {
            addCriterion("refuse_operator <>", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorGreaterThan(String value) {
            addCriterion("refuse_operator >", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_operator >=", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorLessThan(String value) {
            addCriterion("refuse_operator <", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorLessThanOrEqualTo(String value) {
            addCriterion("refuse_operator <=", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorLike(String value) {
            addCriterion("refuse_operator like", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorNotLike(String value) {
            addCriterion("refuse_operator not like", value, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorIn(List<String> values) {
            addCriterion("refuse_operator in", values, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorNotIn(List<String> values) {
            addCriterion("refuse_operator not in", values, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorBetween(String value1, String value2) {
            addCriterion("refuse_operator between", value1, value2, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseOperatorNotBetween(String value1, String value2) {
            addCriterion("refuse_operator not between", value1, value2, "refuseOperator");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIsNull() {
            addCriterion("refuse_time is null");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIsNotNull() {
            addCriterion("refuse_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeEqualTo(Date value) {
            addCriterion("refuse_time =", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotEqualTo(Date value) {
            addCriterion("refuse_time <>", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeGreaterThan(Date value) {
            addCriterion("refuse_time >", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refuse_time >=", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeLessThan(Date value) {
            addCriterion("refuse_time <", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeLessThanOrEqualTo(Date value) {
            addCriterion("refuse_time <=", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIn(List<Date> values) {
            addCriterion("refuse_time in", values, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotIn(List<Date> values) {
            addCriterion("refuse_time not in", values, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeBetween(Date value1, Date value2) {
            addCriterion("refuse_time between", value1, value2, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotBetween(Date value1, Date value2) {
            addCriterion("refuse_time not between", value1, value2, "refuseTime");
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
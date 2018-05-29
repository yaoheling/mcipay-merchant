package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentJournalEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public PaymentJournalEntityCriteria() {
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

        public Criteria andUserCardNumberIsNull() {
            addCriterion("user_card_number is null");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberIsNotNull() {
            addCriterion("user_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberEqualTo(String value) {
            addCriterion("user_card_number =", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberNotEqualTo(String value) {
            addCriterion("user_card_number <>", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberGreaterThan(String value) {
            addCriterion("user_card_number >", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_card_number >=", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberLessThan(String value) {
            addCriterion("user_card_number <", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberLessThanOrEqualTo(String value) {
            addCriterion("user_card_number <=", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberLike(String value) {
            addCriterion("user_card_number like", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberNotLike(String value) {
            addCriterion("user_card_number not like", value, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberIn(List<String> values) {
            addCriterion("user_card_number in", values, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberNotIn(List<String> values) {
            addCriterion("user_card_number not in", values, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberBetween(String value1, String value2) {
            addCriterion("user_card_number between", value1, value2, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserCardNumberNotBetween(String value1, String value2) {
            addCriterion("user_card_number not between", value1, value2, "userCardNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountIsNull() {
            addCriterion("merchant_cny_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountIsNotNull() {
            addCriterion("merchant_cny_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountEqualTo(Long value) {
            addCriterion("merchant_cny_amount =", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountNotEqualTo(Long value) {
            addCriterion("merchant_cny_amount <>", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountGreaterThan(Long value) {
            addCriterion("merchant_cny_amount >", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_cny_amount >=", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountLessThan(Long value) {
            addCriterion("merchant_cny_amount <", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountLessThanOrEqualTo(Long value) {
            addCriterion("merchant_cny_amount <=", value, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountIn(List<Long> values) {
            addCriterion("merchant_cny_amount in", values, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountNotIn(List<Long> values) {
            addCriterion("merchant_cny_amount not in", values, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountBetween(Long value1, Long value2) {
            addCriterion("merchant_cny_amount between", value1, value2, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantCnyAmountNotBetween(Long value1, Long value2) {
            addCriterion("merchant_cny_amount not between", value1, value2, "merchantCnyAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountIsNull() {
            addCriterion("management_trans_amount is null");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountIsNotNull() {
            addCriterion("management_trans_amount is not null");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountEqualTo(Long value) {
            addCriterion("management_trans_amount =", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountNotEqualTo(Long value) {
            addCriterion("management_trans_amount <>", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountGreaterThan(Long value) {
            addCriterion("management_trans_amount >", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("management_trans_amount >=", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountLessThan(Long value) {
            addCriterion("management_trans_amount <", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountLessThanOrEqualTo(Long value) {
            addCriterion("management_trans_amount <=", value, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountIn(List<Long> values) {
            addCriterion("management_trans_amount in", values, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountNotIn(List<Long> values) {
            addCriterion("management_trans_amount not in", values, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountBetween(Long value1, Long value2) {
            addCriterion("management_trans_amount between", value1, value2, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementTransAmountNotBetween(Long value1, Long value2) {
            addCriterion("management_trans_amount not between", value1, value2, "managementTransAmount");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeIsNull() {
            addCriterion("management_service_charge is null");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeIsNotNull() {
            addCriterion("management_service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeEqualTo(Long value) {
            addCriterion("management_service_charge =", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeNotEqualTo(Long value) {
            addCriterion("management_service_charge <>", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeGreaterThan(Long value) {
            addCriterion("management_service_charge >", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeGreaterThanOrEqualTo(Long value) {
            addCriterion("management_service_charge >=", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeLessThan(Long value) {
            addCriterion("management_service_charge <", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeLessThanOrEqualTo(Long value) {
            addCriterion("management_service_charge <=", value, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeIn(List<Long> values) {
            addCriterion("management_service_charge in", values, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeNotIn(List<Long> values) {
            addCriterion("management_service_charge not in", values, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeBetween(Long value1, Long value2) {
            addCriterion("management_service_charge between", value1, value2, "managementServiceCharge");
            return (Criteria) this;
        }

        public Criteria andManagementServiceChargeNotBetween(Long value1, Long value2) {
            addCriterion("management_service_charge not between", value1, value2, "managementServiceCharge");
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

        public Criteria andTransQueryCountIsNull() {
            addCriterion("trans_query_count is null");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountIsNotNull() {
            addCriterion("trans_query_count is not null");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountEqualTo(Integer value) {
            addCriterion("trans_query_count =", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountNotEqualTo(Integer value) {
            addCriterion("trans_query_count <>", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountGreaterThan(Integer value) {
            addCriterion("trans_query_count >", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_query_count >=", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountLessThan(Integer value) {
            addCriterion("trans_query_count <", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("trans_query_count <=", value, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountIn(List<Integer> values) {
            addCriterion("trans_query_count in", values, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountNotIn(List<Integer> values) {
            addCriterion("trans_query_count not in", values, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("trans_query_count between", value1, value2, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_query_count not between", value1, value2, "transQueryCount");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeIsNull() {
            addCriterion("trans_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeIsNotNull() {
            addCriterion("trans_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeEqualTo(Date value) {
            addCriterion("trans_modify_time =", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeNotEqualTo(Date value) {
            addCriterion("trans_modify_time <>", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeGreaterThan(Date value) {
            addCriterion("trans_modify_time >", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_modify_time >=", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeLessThan(Date value) {
            addCriterion("trans_modify_time <", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("trans_modify_time <=", value, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeIn(List<Date> values) {
            addCriterion("trans_modify_time in", values, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeNotIn(List<Date> values) {
            addCriterion("trans_modify_time not in", values, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeBetween(Date value1, Date value2) {
            addCriterion("trans_modify_time between", value1, value2, "transModifyTime");
            return (Criteria) this;
        }

        public Criteria andTransModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("trans_modify_time not between", value1, value2, "transModifyTime");
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
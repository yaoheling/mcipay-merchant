package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerchantAccountEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MerchantAccountEntityCriteria() {
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

        public Criteria andMerchantCurrencyIsNull() {
            addCriterion("merchant_currency is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyIsNotNull() {
            addCriterion("merchant_currency is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyEqualTo(String value) {
            addCriterion("merchant_currency =", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyNotEqualTo(String value) {
            addCriterion("merchant_currency <>", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyGreaterThan(String value) {
            addCriterion("merchant_currency >", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_currency >=", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyLessThan(String value) {
            addCriterion("merchant_currency <", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyLessThanOrEqualTo(String value) {
            addCriterion("merchant_currency <=", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyLike(String value) {
            addCriterion("merchant_currency like", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyNotLike(String value) {
            addCriterion("merchant_currency not like", value, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyIn(List<String> values) {
            addCriterion("merchant_currency in", values, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyNotIn(List<String> values) {
            addCriterion("merchant_currency not in", values, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyBetween(String value1, String value2) {
            addCriterion("merchant_currency between", value1, value2, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andMerchantCurrencyNotBetween(String value1, String value2) {
            addCriterion("merchant_currency not between", value1, value2, "merchantCurrency");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNull() {
            addCriterion("request_amount is null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNotNull() {
            addCriterion("request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountEqualTo(BigDecimal value) {
            addCriterion("request_amount =", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotEqualTo(BigDecimal value) {
            addCriterion("request_amount <>", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThan(BigDecimal value) {
            addCriterion("request_amount >", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount >=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThan(BigDecimal value) {
            addCriterion("request_amount <", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount <=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIn(List<BigDecimal> values) {
            addCriterion("request_amount in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotIn(List<BigDecimal> values) {
            addCriterion("request_amount not in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount not between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountIsNull() {
            addCriterion("merchant_service_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountIsNotNull() {
            addCriterion("merchant_service_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_service_amount =", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_service_amount <>", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_service_amount >", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_amount >=", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountLessThan(BigDecimal value) {
            addCriterion("merchant_service_amount <", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_service_amount <=", value, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_service_amount in", values, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_service_amount not in", values, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_amount between", value1, value2, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantServiceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_service_amount not between", value1, value2, "merchantServiceAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountIsNull() {
            addCriterion("merchant_deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountIsNotNull() {
            addCriterion("merchant_deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_deposit_amount =", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_deposit_amount <>", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_deposit_amount >", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_deposit_amount >=", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountLessThan(BigDecimal value) {
            addCriterion("merchant_deposit_amount <", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_deposit_amount <=", value, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_deposit_amount in", values, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_deposit_amount not in", values, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_deposit_amount between", value1, value2, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantDepositAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_deposit_amount not between", value1, value2, "merchantDepositAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountIsNull() {
            addCriterion("merchant_settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountIsNotNull() {
            addCriterion("merchant_settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountEqualTo(BigDecimal value) {
            addCriterion("merchant_settle_amount =", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountNotEqualTo(BigDecimal value) {
            addCriterion("merchant_settle_amount <>", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountGreaterThan(BigDecimal value) {
            addCriterion("merchant_settle_amount >", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_settle_amount >=", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountLessThan(BigDecimal value) {
            addCriterion("merchant_settle_amount <", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_settle_amount <=", value, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountIn(List<BigDecimal> values) {
            addCriterion("merchant_settle_amount in", values, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountNotIn(List<BigDecimal> values) {
            addCriterion("merchant_settle_amount not in", values, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_settle_amount between", value1, value2, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantSettleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_settle_amount not between", value1, value2, "merchantSettleAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountIsNull() {
            addCriterion("management_spreads_amount is null");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountIsNotNull() {
            addCriterion("management_spreads_amount is not null");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountEqualTo(BigDecimal value) {
            addCriterion("management_spreads_amount =", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountNotEqualTo(BigDecimal value) {
            addCriterion("management_spreads_amount <>", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountGreaterThan(BigDecimal value) {
            addCriterion("management_spreads_amount >", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("management_spreads_amount >=", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountLessThan(BigDecimal value) {
            addCriterion("management_spreads_amount <", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("management_spreads_amount <=", value, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountIn(List<BigDecimal> values) {
            addCriterion("management_spreads_amount in", values, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountNotIn(List<BigDecimal> values) {
            addCriterion("management_spreads_amount not in", values, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("management_spreads_amount between", value1, value2, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andManagementSpreadsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("management_spreads_amount not between", value1, value2, "managementSpreadsAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNull() {
            addCriterion("actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNotNull() {
            addCriterion("actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualAmountEqualTo(BigDecimal value) {
            addCriterion("actual_amount =", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotEqualTo(BigDecimal value) {
            addCriterion("actual_amount <>", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThan(BigDecimal value) {
            addCriterion("actual_amount >", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount >=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThan(BigDecimal value) {
            addCriterion("actual_amount <", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount <=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIn(List<BigDecimal> values) {
            addCriterion("actual_amount in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotIn(List<BigDecimal> values) {
            addCriterion("actual_amount not in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount not between", value1, value2, "actualAmount");
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
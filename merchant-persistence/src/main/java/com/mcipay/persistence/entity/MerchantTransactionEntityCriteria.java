package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantTransactionEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MerchantTransactionEntityCriteria() {
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

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoIsNull() {
            addCriterion("merchant_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoIsNotNull() {
            addCriterion("merchant_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoEqualTo(String value) {
            addCriterion("merchant_serial_no =", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoNotEqualTo(String value) {
            addCriterion("merchant_serial_no <>", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoGreaterThan(String value) {
            addCriterion("merchant_serial_no >", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_serial_no >=", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoLessThan(String value) {
            addCriterion("merchant_serial_no <", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_serial_no <=", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoLike(String value) {
            addCriterion("merchant_serial_no like", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoNotLike(String value) {
            addCriterion("merchant_serial_no not like", value, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoIn(List<String> values) {
            addCriterion("merchant_serial_no in", values, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoNotIn(List<String> values) {
            addCriterion("merchant_serial_no not in", values, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoBetween(String value1, String value2) {
            addCriterion("merchant_serial_no between", value1, value2, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantSerialNoNotBetween(String value1, String value2) {
            addCriterion("merchant_serial_no not between", value1, value2, "merchantSerialNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNull() {
            addCriterion("merchant_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIsNotNull() {
            addCriterion("merchant_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoEqualTo(String value) {
            addCriterion("merchant_order_no =", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotEqualTo(String value) {
            addCriterion("merchant_order_no <>", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThan(String value) {
            addCriterion("merchant_order_no >", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_no >=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThan(String value) {
            addCriterion("merchant_order_no <", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_no <=", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoLike(String value) {
            addCriterion("merchant_order_no like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotLike(String value) {
            addCriterion("merchant_order_no not like", value, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoIn(List<String> values) {
            addCriterion("merchant_order_no in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotIn(List<String> values) {
            addCriterion("merchant_order_no not in", values, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("merchant_order_no between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("merchant_order_no not between", value1, value2, "merchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeIsNull() {
            addCriterion("merchant_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeIsNotNull() {
            addCriterion("merchant_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeEqualTo(Date value) {
            addCriterion("merchant_create_time =", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeNotEqualTo(Date value) {
            addCriterion("merchant_create_time <>", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeGreaterThan(Date value) {
            addCriterion("merchant_create_time >", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_create_time >=", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeLessThan(Date value) {
            addCriterion("merchant_create_time <", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_create_time <=", value, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeIn(List<Date> values) {
            addCriterion("merchant_create_time in", values, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeNotIn(List<Date> values) {
            addCriterion("merchant_create_time not in", values, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_create_time between", value1, value2, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_create_time not between", value1, value2, "merchantCreateTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeIsNull() {
            addCriterion("management_trans_time is null");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeIsNotNull() {
            addCriterion("management_trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeEqualTo(Date value) {
            addCriterion("management_trans_time =", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeNotEqualTo(Date value) {
            addCriterion("management_trans_time <>", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeGreaterThan(Date value) {
            addCriterion("management_trans_time >", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("management_trans_time >=", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeLessThan(Date value) {
            addCriterion("management_trans_time <", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("management_trans_time <=", value, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeIn(List<Date> values) {
            addCriterion("management_trans_time in", values, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeNotIn(List<Date> values) {
            addCriterion("management_trans_time not in", values, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeBetween(Date value1, Date value2) {
            addCriterion("management_trans_time between", value1, value2, "managementTransTime");
            return (Criteria) this;
        }

        public Criteria andManagementTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("management_trans_time not between", value1, value2, "managementTransTime");
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

        public Criteria andMerchantCardTypeIsNull() {
            addCriterion("merchant_card_type is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeIsNotNull() {
            addCriterion("merchant_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeEqualTo(String value) {
            addCriterion("merchant_card_type =", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeNotEqualTo(String value) {
            addCriterion("merchant_card_type <>", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeGreaterThan(String value) {
            addCriterion("merchant_card_type >", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_card_type >=", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeLessThan(String value) {
            addCriterion("merchant_card_type <", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeLessThanOrEqualTo(String value) {
            addCriterion("merchant_card_type <=", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeLike(String value) {
            addCriterion("merchant_card_type like", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeNotLike(String value) {
            addCriterion("merchant_card_type not like", value, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeIn(List<String> values) {
            addCriterion("merchant_card_type in", values, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeNotIn(List<String> values) {
            addCriterion("merchant_card_type not in", values, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeBetween(String value1, String value2) {
            addCriterion("merchant_card_type between", value1, value2, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantCardTypeNotBetween(String value1, String value2) {
            addCriterion("merchant_card_type not between", value1, value2, "merchantCardType");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountIsNull() {
            addCriterion("merchant_foreign_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountIsNotNull() {
            addCriterion("merchant_foreign_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountEqualTo(Long value) {
            addCriterion("merchant_foreign_amount =", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountNotEqualTo(Long value) {
            addCriterion("merchant_foreign_amount <>", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountGreaterThan(Long value) {
            addCriterion("merchant_foreign_amount >", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_foreign_amount >=", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountLessThan(Long value) {
            addCriterion("merchant_foreign_amount <", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountLessThanOrEqualTo(Long value) {
            addCriterion("merchant_foreign_amount <=", value, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountIn(List<Long> values) {
            addCriterion("merchant_foreign_amount in", values, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountNotIn(List<Long> values) {
            addCriterion("merchant_foreign_amount not in", values, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountBetween(Long value1, Long value2) {
            addCriterion("merchant_foreign_amount between", value1, value2, "merchantForeignAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantForeignAmountNotBetween(Long value1, Long value2) {
            addCriterion("merchant_foreign_amount not between", value1, value2, "merchantForeignAmount");
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

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlIsNull() {
            addCriterion("user_trans_url is null");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlIsNotNull() {
            addCriterion("user_trans_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlEqualTo(String value) {
            addCriterion("user_trans_url =", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlNotEqualTo(String value) {
            addCriterion("user_trans_url <>", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlGreaterThan(String value) {
            addCriterion("user_trans_url >", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_trans_url >=", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlLessThan(String value) {
            addCriterion("user_trans_url <", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlLessThanOrEqualTo(String value) {
            addCriterion("user_trans_url <=", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlLike(String value) {
            addCriterion("user_trans_url like", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlNotLike(String value) {
            addCriterion("user_trans_url not like", value, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlIn(List<String> values) {
            addCriterion("user_trans_url in", values, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlNotIn(List<String> values) {
            addCriterion("user_trans_url not in", values, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlBetween(String value1, String value2) {
            addCriterion("user_trans_url between", value1, value2, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andUserTransUrlNotBetween(String value1, String value2) {
            addCriterion("user_trans_url not between", value1, value2, "userTransUrl");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusIsNull() {
            addCriterion("payment_trans_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusIsNotNull() {
            addCriterion("payment_trans_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusEqualTo(Integer value) {
            addCriterion("payment_trans_status =", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusNotEqualTo(Integer value) {
            addCriterion("payment_trans_status <>", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusGreaterThan(Integer value) {
            addCriterion("payment_trans_status >", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_trans_status >=", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusLessThan(Integer value) {
            addCriterion("payment_trans_status <", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_trans_status <=", value, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusIn(List<Integer> values) {
            addCriterion("payment_trans_status in", values, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusNotIn(List<Integer> values) {
            addCriterion("payment_trans_status not in", values, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_trans_status between", value1, value2, "paymentTransStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTransStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_trans_status not between", value1, value2, "paymentTransStatus");
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

        public Criteria andWaybillStatusIsNull() {
            addCriterion("waybill_status is null");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusIsNotNull() {
            addCriterion("waybill_status is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusEqualTo(Integer value) {
            addCriterion("waybill_status =", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusNotEqualTo(Integer value) {
            addCriterion("waybill_status <>", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusGreaterThan(Integer value) {
            addCriterion("waybill_status >", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("waybill_status >=", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusLessThan(Integer value) {
            addCriterion("waybill_status <", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("waybill_status <=", value, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusIn(List<Integer> values) {
            addCriterion("waybill_status in", values, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusNotIn(List<Integer> values) {
            addCriterion("waybill_status not in", values, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusBetween(Integer value1, Integer value2) {
            addCriterion("waybill_status between", value1, value2, "waybillStatus");
            return (Criteria) this;
        }

        public Criteria andWaybillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("waybill_status not between", value1, value2, "waybillStatus");
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
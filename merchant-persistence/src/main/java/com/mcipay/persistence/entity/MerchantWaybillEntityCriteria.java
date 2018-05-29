package com.mcipay.persistence.entity;

import com.mcipay.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantWaybillEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public MerchantWaybillEntityCriteria() {
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

        public Criteria andWaybillNoIsNull() {
            addCriterion("waybill_no is null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNotNull() {
            addCriterion("waybill_no is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoEqualTo(String value) {
            addCriterion("waybill_no =", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotEqualTo(String value) {
            addCriterion("waybill_no <>", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThan(String value) {
            addCriterion("waybill_no >", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_no >=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThan(String value) {
            addCriterion("waybill_no <", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThanOrEqualTo(String value) {
            addCriterion("waybill_no <=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLike(String value) {
            addCriterion("waybill_no like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotLike(String value) {
            addCriterion("waybill_no not like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIn(List<String> values) {
            addCriterion("waybill_no in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotIn(List<String> values) {
            addCriterion("waybill_no not in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoBetween(String value1, String value2) {
            addCriterion("waybill_no between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotBetween(String value1, String value2) {
            addCriterion("waybill_no not between", value1, value2, "waybillNo");
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

        public Criteria andMerchantCommitTimeIsNull() {
            addCriterion("merchant_commit_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeIsNotNull() {
            addCriterion("merchant_commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeEqualTo(Date value) {
            addCriterion("merchant_commit_time =", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeNotEqualTo(Date value) {
            addCriterion("merchant_commit_time <>", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeGreaterThan(Date value) {
            addCriterion("merchant_commit_time >", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_commit_time >=", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeLessThan(Date value) {
            addCriterion("merchant_commit_time <", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_commit_time <=", value, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeIn(List<Date> values) {
            addCriterion("merchant_commit_time in", values, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeNotIn(List<Date> values) {
            addCriterion("merchant_commit_time not in", values, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_commit_time between", value1, value2, "merchantCommitTime");
            return (Criteria) this;
        }

        public Criteria andMerchantCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_commit_time not between", value1, value2, "merchantCommitTime");
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

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
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
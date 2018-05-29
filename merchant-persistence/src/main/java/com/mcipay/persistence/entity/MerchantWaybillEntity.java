package com.mcipay.persistence.entity;

import java.util.Date;

public class MerchantWaybillEntity {
    private Integer id;

    private Integer merchantTransactionId;

    private String waybillNo;

    private Integer waybillStatus;

    private Date merchantCommitTime;

    private String managementAuditor;

    private Date managementAuditTime;

    private String receiver;

    private String country;

    private String region;

    private String city;

    private String address;

    private String postcode;

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

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public Integer getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(Integer waybillStatus) {
        this.waybillStatus = waybillStatus;
    }

    public Date getMerchantCommitTime() {
        return merchantCommitTime;
    }

    public void setMerchantCommitTime(Date merchantCommitTime) {
        this.merchantCommitTime = merchantCommitTime;
    }

    public String getManagementAuditor() {
        return managementAuditor;
    }

    public void setManagementAuditor(String managementAuditor) {
        this.managementAuditor = managementAuditor == null ? null : managementAuditor.trim();
    }

    public Date getManagementAuditTime() {
        return managementAuditTime;
    }

    public void setManagementAuditTime(Date managementAuditTime) {
        this.managementAuditTime = managementAuditTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}
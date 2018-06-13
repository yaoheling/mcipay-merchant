package com.merchant.admin.bo;

import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;

import java.util.List;

public class SaveMerchantInfo {

    private MerchantInfoEntity merchantInfo;
    private List<MerchantBankInfoEntity> merchantBankInfoEntityList;

    public MerchantInfoEntity getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(MerchantInfoEntity merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public List<MerchantBankInfoEntity> getMerchantBankInfoEntityList() {
        return merchantBankInfoEntityList;
    }

    public void setMerchantBankInfoEntityList(List<MerchantBankInfoEntity> merchantBankInfoEntityList) {
        this.merchantBankInfoEntityList = merchantBankInfoEntityList;
    }
}

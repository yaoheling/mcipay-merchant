package com.mcipay.persistence.entity.manual;

import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;

import java.util.List;

public class CompleteMerchantInfoEntity extends MerchantInfoEntity {

    private List<MerchantBankInfoEntity> merchantBankInfoEntityList;

    public List<MerchantBankInfoEntity> getMerchantBankInfoEntityList() {
        return merchantBankInfoEntityList;
    }

    public void setMerchantBankInfoEntityList(List<MerchantBankInfoEntity> merchantBankInfoEntityList) {
        this.merchantBankInfoEntityList = merchantBankInfoEntityList;
    }

}

package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantInfoEntityCriteria;
import com.mcipay.persistence.entity.manual.CompleteMerchantInfoEntity;

import java.util.List;

public interface CompleteMerchantInfoEntityMapper {

    List<CompleteMerchantInfoEntity> selectByExample(MerchantInfoEntityCriteria example);

}

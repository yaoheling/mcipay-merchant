package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantBankInfoEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantBankInfoEntityMapper {
    int countByExample(MerchantBankInfoEntityCriteria example);

    int deleteByExample(MerchantBankInfoEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantBankInfoEntity record);

    int insertSelective(MerchantBankInfoEntity record);

    List<MerchantBankInfoEntity> selectByExample(MerchantBankInfoEntityCriteria example);

    MerchantBankInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantBankInfoEntity record, @Param("example") MerchantBankInfoEntityCriteria example);

    int updateByExample(@Param("record") MerchantBankInfoEntity record, @Param("example") MerchantBankInfoEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantBankInfoEntity record);

    int updateByPrimaryKey(MerchantBankInfoEntity record);
}
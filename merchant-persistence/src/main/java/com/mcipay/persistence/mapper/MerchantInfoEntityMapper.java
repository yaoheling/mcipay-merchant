package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantInfoEntityMapper {
    int countByExample(MerchantInfoEntityCriteria example);

    int deleteByExample(MerchantInfoEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantInfoEntity record);

    int insertSelective(MerchantInfoEntity record);

    List<MerchantInfoEntity> selectByExample(MerchantInfoEntityCriteria example);

    MerchantInfoEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantInfoEntity record, @Param("example") MerchantInfoEntityCriteria example);

    int updateByExample(@Param("record") MerchantInfoEntity record, @Param("example") MerchantInfoEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantInfoEntity record);

    int updateByPrimaryKey(MerchantInfoEntity record);
}
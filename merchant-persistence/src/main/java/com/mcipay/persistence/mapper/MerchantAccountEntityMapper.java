package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantAccountEntity;
import com.mcipay.persistence.entity.MerchantAccountEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantAccountEntityMapper {
    long countByExample(MerchantAccountEntityCriteria example);

    int deleteByExample(MerchantAccountEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantAccountEntity record);

    int insertSelective(MerchantAccountEntity record);

    List<MerchantAccountEntity> selectByExample(MerchantAccountEntityCriteria example);

    MerchantAccountEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantAccountEntity record, @Param("example") MerchantAccountEntityCriteria example);

    int updateByExample(@Param("record") MerchantAccountEntity record, @Param("example") MerchantAccountEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantAccountEntity record);

    int updateByPrimaryKey(MerchantAccountEntity record);
}
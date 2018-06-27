package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantServiceChargeEntity;
import com.mcipay.persistence.entity.MerchantServiceChargeEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantServiceChargeEntityMapper {
    long countByExample(MerchantServiceChargeEntityCriteria example);

    int deleteByExample(MerchantServiceChargeEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantServiceChargeEntity record);

    int insertSelective(MerchantServiceChargeEntity record);

    List<MerchantServiceChargeEntity> selectByExample(MerchantServiceChargeEntityCriteria example);

    MerchantServiceChargeEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantServiceChargeEntity record, @Param("example") MerchantServiceChargeEntityCriteria example);

    int updateByExample(@Param("record") MerchantServiceChargeEntity record, @Param("example") MerchantServiceChargeEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantServiceChargeEntity record);

    int updateByPrimaryKey(MerchantServiceChargeEntity record);
}
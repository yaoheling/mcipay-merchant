package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantWaybillEntity;
import com.mcipay.persistence.entity.MerchantWaybillEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantWaybillEntityMapper {
    int countByExample(MerchantWaybillEntityCriteria example);

    int deleteByExample(MerchantWaybillEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantWaybillEntity record);

    int insertSelective(MerchantWaybillEntity record);

    List<MerchantWaybillEntity> selectByExample(MerchantWaybillEntityCriteria example);

    MerchantWaybillEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantWaybillEntity record, @Param("example") MerchantWaybillEntityCriteria example);

    int updateByExample(@Param("record") MerchantWaybillEntity record, @Param("example") MerchantWaybillEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantWaybillEntity record);

    int updateByPrimaryKey(MerchantWaybillEntity record);
}
package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantUrlEntity;
import com.mcipay.persistence.entity.MerchantUrlEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantUrlEntityMapper {
    long countByExample(MerchantUrlEntityCriteria example);

    int deleteByExample(MerchantUrlEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantUrlEntity record);

    int insertSelective(MerchantUrlEntity record);

    List<MerchantUrlEntity> selectByExample(MerchantUrlEntityCriteria example);

    MerchantUrlEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantUrlEntity record, @Param("example") MerchantUrlEntityCriteria example);

    int updateByExample(@Param("record") MerchantUrlEntity record, @Param("example") MerchantUrlEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantUrlEntity record);

    int updateByPrimaryKey(MerchantUrlEntity record);
}
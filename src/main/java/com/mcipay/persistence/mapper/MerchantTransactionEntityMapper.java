package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.mcipay.persistence.entity.MerchantTransactionEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantTransactionEntityMapper {
    long countByExample(MerchantTransactionEntityCriteria example);

    int deleteByExample(MerchantTransactionEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantTransactionEntity record);

    int insertSelective(MerchantTransactionEntity record);

    List<MerchantTransactionEntity> selectByExample(MerchantTransactionEntityCriteria example);

    MerchantTransactionEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantTransactionEntity record, @Param("example") MerchantTransactionEntityCriteria example);

    int updateByExample(@Param("record") MerchantTransactionEntity record, @Param("example") MerchantTransactionEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantTransactionEntity record);

    int updateByPrimaryKey(MerchantTransactionEntity record);
}
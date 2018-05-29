package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.MerchantSettlementEntity;
import com.mcipay.persistence.entity.MerchantSettlementEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantSettlementEntityMapper {
    int countByExample(MerchantSettlementEntityCriteria example);

    int deleteByExample(MerchantSettlementEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantSettlementEntity record);

    int insertSelective(MerchantSettlementEntity record);

    List<MerchantSettlementEntity> selectByExample(MerchantSettlementEntityCriteria example);

    MerchantSettlementEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantSettlementEntity record, @Param("example") MerchantSettlementEntityCriteria example);

    int updateByExample(@Param("record") MerchantSettlementEntity record, @Param("example") MerchantSettlementEntityCriteria example);

    int updateByPrimaryKeySelective(MerchantSettlementEntity record);

    int updateByPrimaryKey(MerchantSettlementEntity record);
}
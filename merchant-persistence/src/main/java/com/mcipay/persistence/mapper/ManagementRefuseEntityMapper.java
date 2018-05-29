package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.ManagementRefuseEntity;
import com.mcipay.persistence.entity.ManagementRefuseEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagementRefuseEntityMapper {
    int countByExample(ManagementRefuseEntityCriteria example);

    int deleteByExample(ManagementRefuseEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagementRefuseEntity record);

    int insertSelective(ManagementRefuseEntity record);

    List<ManagementRefuseEntity> selectByExample(ManagementRefuseEntityCriteria example);

    ManagementRefuseEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagementRefuseEntity record, @Param("example") ManagementRefuseEntityCriteria example);

    int updateByExample(@Param("record") ManagementRefuseEntity record, @Param("example") ManagementRefuseEntityCriteria example);

    int updateByPrimaryKeySelective(ManagementRefuseEntity record);

    int updateByPrimaryKey(ManagementRefuseEntity record);
}
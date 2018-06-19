package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.RoleRight;
import com.mcipay.persistence.entity.RoleRightCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRightMapper {
    long countByExample(RoleRightCriteria example);

    int deleteByExample(RoleRightCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    List<RoleRight> selectByExample(RoleRightCriteria example);

    RoleRight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleRight record, @Param("example") RoleRightCriteria example);

    int updateByExample(@Param("record") RoleRight record, @Param("example") RoleRightCriteria example);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}
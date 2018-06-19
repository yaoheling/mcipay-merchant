package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.Right;
import com.mcipay.persistence.entity.RightCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightMapper {
    long countByExample(RightCriteria example);

    int deleteByExample(RightCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Right record);

    int insertSelective(Right record);

    List<Right> selectByExample(RightCriteria example);

    Right selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Right record, @Param("example") RightCriteria example);

    int updateByExample(@Param("record") Right record, @Param("example") RightCriteria example);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}
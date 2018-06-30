package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.Website;
import com.mcipay.persistence.entity.WebsiteCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteMapper {
    long countByExample(WebsiteCriteria example);

    int deleteByExample(WebsiteCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Website record);

    int insertSelective(Website record);

    List<Website> selectByExample(WebsiteCriteria example);

    Website selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Website record, @Param("example") WebsiteCriteria example);

    int updateByExample(@Param("record") Website record, @Param("example") WebsiteCriteria example);

    int updateByPrimaryKeySelective(Website record);

    int updateByPrimaryKey(Website record);
}
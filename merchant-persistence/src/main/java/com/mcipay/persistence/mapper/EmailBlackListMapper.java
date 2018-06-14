package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.EmailBlackList;
import com.mcipay.persistence.entity.EmailBlackListCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailBlackListMapper {
    long countByExample(EmailBlackListCriteria example);

    int deleteByExample(EmailBlackListCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmailBlackList record);

    int insertSelective(EmailBlackList record);

    List<EmailBlackList> selectByExample(EmailBlackListCriteria example);

    EmailBlackList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmailBlackList record, @Param("example") EmailBlackListCriteria example);

    int updateByExample(@Param("record") EmailBlackList record, @Param("example") EmailBlackListCriteria example);

    int updateByPrimaryKeySelective(EmailBlackList record);

    int updateByPrimaryKey(EmailBlackList record);
}
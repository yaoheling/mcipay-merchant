package com.mcipay.persistence.mapper;

import com.mcipay.persistence.entity.PaymentJournalEntity;
import com.mcipay.persistence.entity.PaymentJournalEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentJournalEntityMapper {
    long countByExample(PaymentJournalEntityCriteria example);

    int deleteByExample(PaymentJournalEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentJournalEntity record);

    int insertSelective(PaymentJournalEntity record);

    List<PaymentJournalEntity> selectByExample(PaymentJournalEntityCriteria example);

    PaymentJournalEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentJournalEntity record, @Param("example") PaymentJournalEntityCriteria example);

    int updateByExample(@Param("record") PaymentJournalEntity record, @Param("example") PaymentJournalEntityCriteria example);

    int updateByPrimaryKeySelective(PaymentJournalEntity record);

    int updateByPrimaryKey(PaymentJournalEntity record);
}
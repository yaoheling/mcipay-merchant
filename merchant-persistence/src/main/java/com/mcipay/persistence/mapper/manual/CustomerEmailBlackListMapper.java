package com.mcipay.persistence.mapper.manual;

import com.mcipay.persistence.entity.EmailBlackList;

import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/12
 **/
public interface CustomerEmailBlackListMapper {

    void insertBatch(List<EmailBlackList> list);

    void deleteBatch(List<Integer> list);
}

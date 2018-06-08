package com.merchant.client.service;

import com.mcipay.persistence.entity.EmailBlackList;
import com.mcipay.persistence.entity.EmailBlackListKey;
import com.mcipay.persistence.mapper.EmailBlackListMapper;
import com.merchant.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author hongye.lv
 * @date 2018/06/08
 **/
@Service
public class EmailBlackListService {

    @Resource
    private EmailBlackListMapper emailBlackListMapper;

    public EmailBlackList get(String email) {
        EmailBlackListKey key = new EmailBlackList();
        key.setEmail(email);
        return emailBlackListMapper.selectByPrimaryKey(key);
    }

    public int save(String email) {
        if (get(email) != null) {
            throw new BusinessException("当前邮件已存在");
        }
        EmailBlackList emailBlackList = new EmailBlackList();
        emailBlackList.setEmail(email);
        Date date = new Date();
        emailBlackList.setCreateTime(date);
        emailBlackList.setUpdateTime(date);
        emailBlackList.setStatus("1");
        return emailBlackListMapper.insert(emailBlackList);
    }

}

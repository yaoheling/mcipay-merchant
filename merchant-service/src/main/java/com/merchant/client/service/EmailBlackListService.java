package com.merchant.client.service;

import com.mcipay.persistence.entity.EmailBlackList;
import com.mcipay.persistence.entity.EmailBlackListKey;
import com.mcipay.persistence.mapper.EmailBlackListMapper;
import com.merchant.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
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
        if (StringUtils.isBlank(email)) {
            throw new BusinessException("邮箱不能为空");
        }
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

    public int update(EmailBlackList bean) {
        if (bean.getId() == null) {
            throw new BusinessException("ID不能为空");
        }
        if (StringUtils.isBlank(bean.getEmail())) {
            throw new BusinessException("邮箱不能为空");
        }
        bean.setCreateTime(null);
        bean.setCreateTime(new Date());
        return emailBlackListMapper.updateByPrimaryKeySelective(bean);
    }

    public int delete(EmailBlackListKey key) {
        return emailBlackListMapper.deleteByPrimaryKey(key);
    }

}

package com.merchant.client.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.EmailBlackList;
import com.mcipay.persistence.entity.EmailBlackListCriteria;
import com.mcipay.persistence.entity.EmailBlackListKey;
import com.mcipay.persistence.mapper.EmailBlackListMapper;
import com.mcipay.persistence.mapper.manual.CustomerEmailBlackListMapper;
import com.merchant.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/08
 **/
@Service
public class EmailBlackListService {

    @Resource
    private EmailBlackListMapper emailBlackListMapper;

    @Resource
    private CustomerEmailBlackListMapper customerEmailBlackListMapper;

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

    public void insertBatch(String emails) {
        if (StringUtils.isBlank(emails)) {
            throw new BusinessException("邮箱不能为空");
        }
        String[] emailArr = emails.split(",");
        if (emailArr == null || emailArr.length == 0) {
            throw new BusinessException("邮箱不能为空");
        }
        List<EmailBlackList> lists = new ArrayList<EmailBlackList>();
        EmailBlackList bean = null;
        for (int i = 0; i < emailArr.length; i++) {
            bean = new EmailBlackList();
            bean.setEmail(emailArr[i]);
            Date date = new Date();
            bean.setCreateTime(date);
            bean.setUpdateTime(date);
            bean.setStatus("1");
            lists.add(bean);
        }
        customerEmailBlackListMapper.insertBatch(lists);
    }

    public int update(EmailBlackList bean) {
        if (bean == null) {
            throw new BusinessException("黑名单参数不能为空");
        }
        if (bean.getId() == null) {
            throw new BusinessException("ID不能为空");
        }
        if (StringUtils.isBlank(bean.getEmail())) {
            throw new BusinessException("邮箱不能为空");
        }
        bean.setCreateTime(null);
        bean.setUpdateTime(new Date());
        EmailBlackListCriteria criteria = new EmailBlackListCriteria();
        EmailBlackListCriteria.Criteria query = criteria.or();
        query.andIdEqualTo(bean.getId());
        return emailBlackListMapper.updateByExampleSelective(bean, criteria);
    }

    public int delete(Integer id) {
        if (id == null) {
            throw new BusinessException("ID不能为空");
        }
        EmailBlackListCriteria criteria = new EmailBlackListCriteria();
        EmailBlackListCriteria.Criteria query = criteria.or();
        query.andIdEqualTo(id);
        return emailBlackListMapper.deleteByExample(criteria);
    }

    public void deleteBatch(String ids) {
        if (StringUtils.isBlank(ids)) {
            throw new BusinessException("ID不能为空");
        }
        String[] idArr = ids.split(",");
        if (idArr == null || idArr.length == 0) {
            throw new BusinessException("ID不能为空");
        }
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 0; i < idArr.length; i++) {
            if (StringUtils.isBlank(idArr[i])) {
                continue;
            }
            lists.add(Integer.parseInt(idArr[i]));
        }
        customerEmailBlackListMapper.deleteBatch(lists);
    }

    public List<EmailBlackList> getList(Page page, EmailBlackList emailBlackList) {
        EmailBlackListCriteria criteria = new EmailBlackListCriteria();
        EmailBlackListCriteria.Criteria query = criteria.or();
        if (emailBlackList != null) {
            if (StringUtils.isBlank(emailBlackList.getEmail())) {
                query.andEmailEqualTo(emailBlackList.getEmail());
            }
        }
        criteria.setPage(page);
        criteria.setOrderByClause(" id desc ");
        return emailBlackListMapper.selectByExample(criteria);
    }

}

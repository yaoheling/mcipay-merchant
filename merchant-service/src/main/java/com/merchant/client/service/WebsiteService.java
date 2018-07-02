package com.merchant.client.service;

import com.mcipay.persistence.entity.Website;
import com.mcipay.persistence.entity.WebsiteCriteria;
import com.mcipay.persistence.mapper.WebsiteMapper;
import com.merchant.exception.BusinessException;
import com.merchant.util.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/029
 **/
@Service
public class WebsiteService {

    @Resource
    private WebsiteMapper websiteMapper;

    /*public List<Website> get(Integer status, Date startDate, Date endDate, String url) {
        WebsiteCriteria criteria = new WebsiteCriteria();
        WebsiteCriteria.Criteria query = criteria.or();
        if (status != null) {
            query.andStatusEqualTo(status);
        }
        if (startDate != null) {
            query.andCreateTimeGreaterThanOrEqualTo(startDate);
        }
        if (endDate != null) {
            query.andCreateTimeLessThan(DateUtils.getSpecificTime(endDate, 1));
        }
        if (StringUtils.isBlank(url)) {
            query.andUrlLike(url + "%");
        }
        return websiteMapper.selectByExample(criteria);
    }*/

    @Transactional
    public int save(String url, Integer userId, String remark) {
        if (StringUtils.isBlank(url)) {
            throw new BusinessException("网址不能为空");
        }
        Website website = new Website();
        website.setUrl(url);
        website.setStatus(1);
        Date date = new Date();
        website.setCreateTime(date);
        website.setUpdateTime(date);
        website.setUserId(userId);
        website.setRemark(remark);
        return websiteMapper.insert(website);
    }

    @Transactional
    public int update(Integer id, String url, Integer status, String remark) {
        if (id == null) {
            throw new BusinessException("ID不能为空");
        }
        if (StringUtils.isBlank(url) && status == null && StringUtils.isBlank(remark)) {
            throw new BusinessException("参数不能为空");
        }
        Website website = new Website();
        website.setId(id);
        website.setUrl(url);
        website.setStatus(status);
        website.setRemark(remark);
        return websiteMapper.updateByPrimaryKeySelective(website);
    }

    @Transactional
    public int delete(Integer id) {
        if (id == null) {
            throw new BusinessException("ID不能为空");
        }
        //逻辑删除，更新状态为删除
        return update(id, null, 3, null);
    }

    public void deleteBatch(List<Integer> userIdList) {
        if (CollectionUtils.isEmpty(userIdList)) {
            throw new BusinessException("用户ID不能为空");
        }
        for (Integer userid : userIdList) {
            delete(userid);
        }
    }

    public List<Website> get(Integer status, Date startDate, Date endDate, String url) {
        WebsiteCriteria criteria = new WebsiteCriteria();
        WebsiteCriteria.Criteria query = criteria.or();
        if (status != null) {
            query.andStatusEqualTo(status);
        }
        if (startDate != null) {
            query.andCreateTimeGreaterThanOrEqualTo(startDate);
        }
        if (endDate != null) {
            query.andCreateTimeLessThan(DateUtils.getSpecificTime(endDate, 1));
        }
        if (StringUtils.isBlank(url)) {
            query.andUrlLike(url + "%");
        }
        return websiteMapper.selectByExample(criteria);
    }

}

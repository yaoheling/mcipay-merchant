package com.merchant.client.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.User;
import com.mcipay.persistence.entity.UserCriteria;
import com.mcipay.persistence.mapper.UserMapper;
import com.mcipay.persistence.mapper.UserRoleMapper;
import com.merchant.exception.BusinessException;
import com.merchant.util.MD5;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/08
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    public User get(String username) {
        if (StringUtils.isBlank(username)) {
            throw new BusinessException("用户名不能为空");
        }
        UserCriteria criteria = new UserCriteria();
        UserCriteria.Criteria query = criteria.or();
        query.andUsernameEqualTo(username);
        List<User> lists = userMapper.selectByExample(criteria);
        if (CollectionUtils.isEmpty(lists)) {
            return null;
        }
        return lists.get(0);
    }

    @Transactional
    public int save(User user, List<Integer> roleIdList) {
        if (user == null) {
            throw new BusinessException("用户信息不能为空");
        }
        if (StringUtils.isBlank(user.getUsername())) {
            throw new BusinessException("用户名不能为空");
        }
        if (StringUtils.isBlank(user.getPassword())) {
            throw new BusinessException("密码不能为空");
        }
        user.setPassword(MD5.MD5(user.getPassword()));
        if (StringUtils.isBlank(user.getName())) {
            user.setName(user.getUsername());
        }
        if (user.getStatus() == null) {
            user.setStatus(1);
        }
        user.setCreateTime(new Date());
        return userMapper.insert(user);
    }

    @Transactional
    public int update(User user, String roleIds) {
        if (user == null) {
            throw new BusinessException("用户信息不能为空");
        }
        if (user.getParentId() == null) {
            throw new BusinessException("主账户不能为空");
        }
        if (StringUtils.isNotBlank(user.getPassword())) {
            user.setPassword(MD5.MD5(user.getPassword()));
        }
        if (user.getStatus() == null) {
            user.setStatus(1);
        }
        //todo 更新权限信息
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Transactional
    public int delete(Integer id) {
        if (id == null) {
            throw new BusinessException("ID不能为空");
        }
        //删除用户角色关系

        return userMapper.deleteByPrimaryKey(id);
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
            delete(Integer.parseInt(idArr[i]));
        }
    }

    public List<User> getList(Page page, User user) {
        UserCriteria criteria = new UserCriteria();
        UserCriteria.Criteria query = criteria.or();
        if (StringUtils.isNotBlank(user.getUsername())) {
            query.andUsernameEqualTo(user.getUsername());
        }
        if (StringUtils.isNotBlank(user.getName())) {
            query.andNameEqualTo(user.getName());
        }
        criteria.setPage(page);
        criteria.setOrderByClause(" id desc ");
        return userMapper.selectByExample(criteria);
    }

}

package com.merchant.client.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.Role;
import com.mcipay.persistence.entity.RoleCriteria;
import com.mcipay.persistence.mapper.RoleMapper;
import com.mcipay.persistence.mapper.UserRoleMapper;
import com.merchant.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/08
 **/
@Service
public class RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    public Role get(String name) {
        if (StringUtils.isBlank(name)) {
            throw new BusinessException("角色名称不能为空");
        }
        RoleCriteria criteria = new RoleCriteria();
        RoleCriteria.Criteria query = criteria.or();
        query.andNameEqualTo(name);
        List<Role> lists = roleMapper.selectByExample(criteria);
        if (CollectionUtils.isEmpty(lists)) {
            return null;
        }
        return lists.get(0);
    }

    @Transactional
    public int save(Role role) {
        if (role == null) {
            throw new BusinessException("角色信息不能为空");
        }
        if (StringUtils.isBlank(role.getName())) {
            throw new BusinessException("角色名称不能为空");
        }
        return roleMapper.insert(role);
    }

    @Transactional
    public int update(Role role) {
        if (role == null) {
            throw new BusinessException("角色信息不能为空");
        }
        if (role.getId() == null) {
            throw new BusinessException("角色ID不能为空");
        }
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Transactional
    public int delete(Integer id) {
        if (id == null) {
            throw new BusinessException("ID不能为空");
        }
        //todo 删除权限信息
        return roleMapper.deleteByPrimaryKey(id);
    }

    public List<Role> getList(Page page, Role role) {
        RoleCriteria criteria = new RoleCriteria();
        RoleCriteria.Criteria query = criteria.or();
        if (StringUtils.isNotBlank(role.getName())) {
            query.andNameEqualTo(role.getName());
        }
        criteria.setPage(page);
        criteria.setOrderByClause(" id desc ");
        return roleMapper.selectByExample(criteria);
    }

}

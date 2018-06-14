package com.merchant.client.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.UserRole;
import com.mcipay.persistence.entity.UserRoleCriteria;
import com.mcipay.persistence.mapper.UserRoleMapper;
import com.merchant.exception.BusinessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/08
 **/
@Service
public class UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    public int save(UserRole userRole) {
        if (userRole == null) {
            throw new BusinessException("关系不能为空");
        }
        if (userRole.getUserId() == null) {
            throw new BusinessException("账户ID不能为空");
        }
        if (userRole.getRoleId() == null) {
            throw new BusinessException("角色ID不能为空");
        }
        return userRoleMapper.insert(userRole);
    }

    @Transactional
    public int delete(UserRole userRole) {
        if (userRole == null) {
            throw new BusinessException("关系不能为空");
        }
        if (userRole.getUserId() == null && userRole.getRoleId() == null) {
            throw new BusinessException("账户ID和角色ID不能为空");
        }
        UserRoleCriteria criteria = new UserRoleCriteria();
        UserRoleCriteria.Criteria query = criteria.or();
        if (userRole.getUserId() != null) {
            query.andUserIdEqualTo(userRole.getUserId());
        }
        if (userRole.getRoleId() != null) {
            query.andRoleIdEqualTo(userRole.getRoleId());
        }
        return userRoleMapper.deleteByExample(criteria);
    }

    public List<UserRole> get(UserRole userRole) {
        if (userRole == null) {
            throw new BusinessException("查询条件为空");
        }
        return getBase(null, userRole);
    }

    public List<UserRole> getList(Page page, UserRole userRole) {
        return getBase(page, userRole);
    }

    private List<UserRole> getBase(Page page, UserRole userRole) {
        UserRoleCriteria criteria = new UserRoleCriteria();
        UserRoleCriteria.Criteria query = criteria.or();
        if (userRole != null) {
            if (userRole.getId() != null) {
                query.andIdEqualTo(userRole.getId());
            }
            if (userRole.getUserId() != null) {
                query.andUserIdEqualTo(userRole.getUserId());
            }
            if (userRole.getRoleId() != null) {
                query.andRoleIdEqualTo(userRole.getRoleId());
            }
        }
        if (page != null) {
            criteria.setPage(page);
        }
        criteria.setOrderByClause(" id desc ");
        return userRoleMapper.selectByExample(criteria);
    }

}

package com.mcipay.controller;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.User;
import com.merchant.client.service.UserService;
import com.merchant.exception.BusinessException;
import com.merchant.util.BaseResponse;
import com.merchant.util.DataUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/05
 **/
@Api(value = "用户管理", description = "用户管理")
@Controller
@RequestMapping("/api/client/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("新增")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User"),
            @ApiImplicitParam(name = "roleIds", value = "角色ID，逗号分隔", required = false, dataType = "String")
    })
    @PostMapping(value = "/save")
    @ResponseBody
    public BaseResponse save(@RequestBody User user, String roleIds) {
        if (user == null) {
            throw new BusinessException("用户信息不能为空");
        }
        if (user.getParentId() == null) {
            throw new BusinessException("主账户不能为空");
        }
        List<Integer> list = DataUtil.getListByComma(roleIds);
        userService.save(user, list);
        return BaseResponse.success("新增成功");
    }

    @ApiOperation("修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User"),
            @ApiImplicitParam(name = "roleIds", value = "角色ID，逗号分隔", required = false, dataType = "String")
    })
    @PostMapping(value = "/update")
    @ResponseBody
    public BaseResponse update(@RequestBody User user, String roleIds) {
        List<Integer> list = DataUtil.getListByComma(roleIds);
        userService.update(user, list);
        return BaseResponse.success("修改成功");
    }

    @ApiOperation("删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/delete")
    @ResponseBody
    public BaseResponse delete(@RequestBody Integer id) {
        userService.delete(id);
        return BaseResponse.success("删除成功");
    }

    @ApiOperation("批量删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "邮件地址", required = true, dataType = "String")
    })
    @PostMapping(value = "/deleteBatch")
    @ResponseBody
    public BaseResponse deleteBatch(@RequestBody String userIds) {
        List<Integer> list = DataUtil.getListByComma(userIds);
        userService.deleteBatch(list);
        return BaseResponse.success("批量删除成功");
    }

    @ApiOperation("查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页实体", required = true, dataType = "Page"),
            @ApiImplicitParam(name = "username", value = "登陆名", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "名称", required = false, dataType = "String", paramType = "query")
    })
    @GetMapping(value = "/getList")
    @ResponseBody
    public BaseResponse getList(@RequestBody Page page, String username, String name) {
        User user = new User();
        user.setUsername(username);
        user.setName(name);
        List<User> list = userService.getList(page, user);
        return BaseResponse.success("查询成功", list);
    }

}

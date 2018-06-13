package com.mcipay.controller;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.EmailBlackList;
import com.merchant.client.service.EmailBlackListService;
import com.merchant.util.BaseResponse;
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
@Api(value = "邮箱黑名单管理", description = "邮箱黑名单管理")
@Controller
@RequestMapping("/api/client/emailBlackList")
public class EmailBlackListController {

    @Resource
    private EmailBlackListService emailBlackListService;

    @ApiOperation("新增")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮件地址", required = true, dataType = "String")
    })
    @PostMapping(value = "/save")
    @ResponseBody
    public BaseResponse save(@RequestBody String email) {
        emailBlackListService.save(email);
        return BaseResponse.success("新增成功");
    }

    @ApiOperation("批量新增")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emails", value = "邮件地址", required = true, dataType = "String")
    })
    @PostMapping(value = "/insertBatch")
    @ResponseBody
    public BaseResponse insertBatch(@RequestBody String emails) {
        emailBlackListService.insertBatch(emails);
        return BaseResponse.success("批量新增成功");
    }

    @ApiOperation("修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emailBlackList", value = "黑名单实体", required = true, dataType = "EmailBlackList")
    })
    @PostMapping(value = "/update")
    @ResponseBody
    public BaseResponse update(@RequestBody EmailBlackList emailBlackList) {
        emailBlackListService.update(emailBlackList);
        return BaseResponse.success("修改成功");
    }

    @ApiOperation("删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "黑名单实体", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/delete")
    @ResponseBody
    public BaseResponse delete(@RequestBody Integer id) {
        emailBlackListService.delete(id);
        return BaseResponse.success("删除成功");
    }

    @ApiOperation("批量删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "邮件地址", required = true, dataType = "String")
    })
    @PostMapping(value = "/deleteBatch")
    @ResponseBody
    public BaseResponse deleteBatch(@RequestBody String ids) {
        emailBlackListService.deleteBatch(ids);
        return BaseResponse.success("批量删除成功");
    }

    @ApiOperation("查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页实体", required = true, dataType = "Page"),
            @ApiImplicitParam(name = "emailBlackList", value = "交易信息实体", required = true, dataType = "EmailBlackList")
    })
    @GetMapping(value = "/getList")
    @ResponseBody
    public BaseResponse getList(@RequestBody Page page, @RequestBody EmailBlackList emailBlackList) {
        List<EmailBlackList> list = emailBlackListService.getList(page, emailBlackList);
        return BaseResponse.success("查询成功", list);
    }

}

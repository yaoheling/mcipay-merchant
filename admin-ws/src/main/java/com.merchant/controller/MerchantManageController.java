package com.merchant.controller;

import com.merchant.admin.bo.*;
import com.merchant.admin.service.MerchantManageService;
import com.merchant.util.BaseResponse;
import com.merchant.util.QueryResponse;
import com.merchant.util.ValidateAop;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

@Api(value = "商户管理接口", description="商户管理服务API根目录")
@Controller
@RequestMapping("/api/admin/merchant/manage")
public class MerchantManageController {

    @Autowired
    private MerchantManageService merchantManageService;

    @ApiOperation("添加商户信息")
    @ApiImplicitParam(name = "saveMerchantInfo", value = "商户实体", required = true, dataType = "SaveMerchantInfo")
    @PostMapping(value = "/saveMerchant", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public BaseResponse saveMerchantInfo(@RequestBody SaveMerchantInfo saveMerchantInfo) {
        BaseResponse response = merchantManageService.saveMerchantInfo(saveMerchantInfo.getMerchantInfo(),
                saveMerchantInfo.getMerchantBankInfoEntityList());
        return response;
    }

    @ApiOperation("查询单个商户信息")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "merchantId", value = "商户ID", required = true)
    })
    @GetMapping(value = "/getMerchantInfo")
    @ResponseBody
    public BaseResponse getMerchantInfo(GetMerchantRequest request) {
        BaseResponse response = merchantManageService.queryMerchantList(request);
        if(response.isSuccess() && response.getData() != null) {
            QueryResponse queryResponse = (QueryResponse) response.getData();
            if(CollectionUtils.isEmpty(queryResponse.getRows())) {
                response.error();
                response.setData(null);
                response.setMessage("商户信息不存在");
            } else {
                response.setData(queryResponse.getRows().iterator().next());
            }
        }
        return response;
    }

    @ApiOperation("分页查询商户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页码", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true)
    })
    @GetMapping(value = "/pageMerchantInfo")
    @ResponseBody
    public BaseResponse pageMerchantInfo(GetMerchantRequest request) {
        BaseResponse response = merchantManageService.queryMerchantList(request);
        return response;
    }

    @ApiOperation("商户开通与关闭")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "merchantId", value = "商户ID", required = true, dataType = "Long"),
        @ApiImplicitParam(name = "status", value = "商户状态(-1禁用;1启用)", required = true, dataType = "Long")
    })
    @PostMapping(value = "/updateMerchantStatus")
    @ResponseBody
    public BaseResponse updateMerchantStatus(Integer merchantId, Integer status) {
        BaseResponse response = merchantManageService.updateMerchantStatus(merchantId, status);
        return response;
    }

    @ApiOperation("更新商户信息")
    @ApiImplicitParam(name = "updateMerchantInfo", value = "商户实体", required = true, dataType = "SaveMerchantInfo")
    @PostMapping(value = "/updateMerchantInfo", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public BaseResponse updateMerchantInfo(@RequestBody SaveMerchantInfo updateMerchantInfo) {
        BaseResponse response = merchantManageService.updateMerchant(updateMerchantInfo.getMerchantInfo(),
                updateMerchantInfo.getMerchantBankInfoEntityList());
        return response;
    }

    @ApiOperation("分页查询商户Url信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo", value = "页码", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true)
    })
    @GetMapping(value = "/pageMerchantUrl")
    @ResponseBody
    public BaseResponse pageMerchantUrl(GetMerchantUrlRequest request) {
        BaseResponse response = merchantManageService.getMerchantUrl(request);
        return response;
    }

    @ApiOperation("更新商户URL状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "url主键", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "status", value = "URL审核状态 1：审核通过；2：驳回", required = true, dataType = "Long")
    })
    @PostMapping(value = "/updateMerchantUrlStatus")
    @ResponseBody
    public BaseResponse updateMerchantUrlStatus(Integer id, Integer status) {
        BaseResponse response = merchantManageService.updateMerchantUrlStatus(id, status);
        return response;
    }

    @ApiOperation("保存商户服务费")
    @PostMapping(value = "/saveMerchantServiceCharge")
    @ResponseBody
    @ValidateAop
    public BaseResponse saveMerchantServiceCharge(MerchantServiceCharge serviceCharge) {
        BaseResponse response = merchantManageService.saveMerchantServiceCharge(serviceCharge);
        return response;
    }

    @ApiOperation("分页查询运单信息")
    @GetMapping(value = "/pageMerchantWaybillAudit")
    @ResponseBody
    public BaseResponse pageMerchantWaybillAudit(GetMerchantWaybillAuditRequest request) {
        BaseResponse response = merchantManageService.getMerchantWaybillAuditList(request);
        return response;
    }

}

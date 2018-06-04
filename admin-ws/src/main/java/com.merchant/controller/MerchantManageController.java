package com.merchant.controller;

import com.merchant.admin.bo.SaveMerchantInfo;
import com.merchant.admin.service.MerchantManageService;
import com.merchant.util.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "商户管理接口", description="商户管理服务API根目录")
@Controller
@RequestMapping("/admin/merchant/manage")
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

}

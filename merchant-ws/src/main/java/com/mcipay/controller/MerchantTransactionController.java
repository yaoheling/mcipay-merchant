package com.mcipay.controller;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.merchant.client.service.MerchantTransactionService;
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
@Api(value = "交易接口", description = "交易相关")
@Controller
@RequestMapping("/api/client/merchantTransaction")
public class MerchantTransactionController {

    @Resource
    private MerchantTransactionService merchantTransactionService;

    @ApiOperation("交易查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页实体", required = true, dataType = "Page"),
            @ApiImplicitParam(name = "entity", value = "交易信息实体", required = true, dataType = "MerchantTransactionEntity"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = true, dataType = "String"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = true, dataType = "String"),
    })
    @GetMapping(value = "/getList")
    @ResponseBody
    public BaseResponse getList(@RequestBody Page page, @RequestBody MerchantTransactionEntity entity,
                                @RequestParam String startTime, @RequestParam String endTime) {

        List<MerchantTransactionEntity> list = merchantTransactionService.getList(page, entity, startTime, endTime);
        return BaseResponse.success("查询成功", list);
    }

}

package com.mcipay.controller;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantTransactionEntity;
import com.merchant.admin.service.MerchantTransactionService;
import com.merchant.util.BaseResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/05
 **/
@Api(value = "交易接口", description = "交易相关")
@Controller
@RequestMapping("/api/client/merchantTransaction")
public class MerchantTransactionController {

    @Autowired
    private MerchantTransactionService merchantTransactionService;


    public BaseResponse getList(Page page, MerchantTransactionEntity entity, String startTime, String endTime) {

        List<MerchantTransactionEntity> list = merchantTransactionService.getList(page, entity, startTime, endTime);
        return BaseResponse.success("查询成功", list);
    }

}

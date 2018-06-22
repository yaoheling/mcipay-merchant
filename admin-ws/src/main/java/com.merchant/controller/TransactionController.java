package com.merchant.controller;

import com.merchant.admin.bo.MerchantTransactionRequest;
import com.merchant.admin.service.TransactionService;
import com.merchant.util.BaseResponse;
import com.merchant.util.ValidatorResult;
import com.merchant.util.ValidatorUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "商户交易接口", description="商户交易API根目录")
@Controller
@RequestMapping("/api/merchant/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping(value = "/trade", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public BaseResponse transactionAgent(@RequestBody MerchantTransactionRequest request) {
        BaseResponse response = new BaseResponse();
        ValidatorResult validatorResult = ValidatorUtil.validate(request);
        if(!validatorResult.isAvailable()) {
            response.error();
            response.setMessage(validatorResult.getMessage());
            return response;
        }
        response = transactionService.transactionAgent(request);
        return response;
    }

}

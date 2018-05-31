package com.merchant.admin.service;

import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.mcipay.persistence.mapper.MerchantBankInfoEntityMapper;
import com.mcipay.persistence.mapper.MerchantInfoEntityMapper;
import com.merchant.util.BaseResponse;
import com.merchant.util.ResponseCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class MerchantManageService {

    @Resource(name = "merchantInfoEntityMapper")
    private MerchantInfoEntityMapper merchantInfoEntityMapper;

    @Resource(name = "merchantBankInfoEntityMapper")
    private MerchantBankInfoEntityMapper merchantBankInfoEntityMapper;

    public BaseResponse saveMerchantInfo(MerchantInfoEntity merchantInfo, MerchantBankInfoEntity merchantBankInfo) {
        merchantInfo.setOperatorId(null);
        merchantInfo.setCreateTime(new Date());
        merchantInfoEntityMapper.insert(merchantInfo);

        merchantBankInfo.setMerchantId(merchantInfo.getId());
        merchantBankInfoEntityMapper.insert(merchantBankInfo);

        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        return response;
    }

}

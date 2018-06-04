package com.merchant.admin.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntityCriteria;
import com.mcipay.persistence.mapper.MerchantBankInfoEntityMapper;
import com.mcipay.persistence.mapper.MerchantInfoEntityMapper;
import com.merchant.admin.bo.QueryMerchantRequest;
import com.merchant.util.BaseResponse;
import com.merchant.util.ResponseCode;
import com.merchant.util.SessionUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class MerchantManageService {

    @Resource(name = "merchantInfoEntityMapper")
    private MerchantInfoEntityMapper merchantInfoMapper;

    @Resource(name = "merchantBankInfoEntityMapper")
    private MerchantBankInfoEntityMapper merchantBankInfoMapper;

    @Transactional
    public BaseResponse saveMerchantInfo(MerchantInfoEntity merchantInfo, List<MerchantBankInfoEntity> merchantBankInfoList) {
        BaseResponse response = new BaseResponse();
        // 根据全称判断商户是否存在, 存在则不进行录入
        MerchantInfoEntityCriteria condition = new MerchantInfoEntityCriteria();
        MerchantInfoEntityCriteria.Criteria criteria = condition.createCriteria();
        criteria.andFullNameEqualTo(merchantInfo.getFullName());
        List<MerchantInfoEntity> existed = merchantInfoMapper.selectByExample(condition);
        if(!CollectionUtils.isEmpty(existed)) {
            response.setCode(ResponseCode.FAILED);
            response.setMessage("商户[" + merchantInfo.getFullName() + "]已录入!");
            return response;
        }

        // 保存商户
        merchantInfo.setOperatorId(SessionUtil.getUserId());
        merchantInfo.setCreateTime(new Date());
        merchantInfoMapper.insert(merchantInfo);

        // 保存商户结算银行信息
        if(!CollectionUtils.isEmpty(merchantBankInfoList)) {
            for (MerchantBankInfoEntity merchantBankInfo : merchantBankInfoList) {
                merchantBankInfo.setMerchantId(merchantInfo.getId());
                merchantBankInfoMapper.insert(merchantBankInfo);
            }
        }

        response.setCode(ResponseCode.SUCCESS);
        return response;
    }

    public void queryMerchantList(QueryMerchantRequest request) {
        MerchantInfoEntityCriteria condition = new MerchantInfoEntityCriteria();
        Page page = new Page(request.getSqlStart(), request.getPageSize());
        condition.setPage(page);
//        merchantInfoMapper
    }

}

package com.merchant.admin.service;

import com.mcipay.page.Page;
import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantBankInfoEntityCriteria;
import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntityCriteria;
import com.mcipay.persistence.entity.manual.CompleteMerchantInfoEntity;
import com.mcipay.persistence.mapper.CompleteMerchantInfoEntityMapper;
import com.mcipay.persistence.mapper.MerchantBankInfoEntityMapper;
import com.mcipay.persistence.mapper.MerchantInfoEntityMapper;
import com.merchant.admin.bo.QueryMerchantRequest;
import com.merchant.admin.bo.SaveMerchantInfo;
import com.merchant.util.*;
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

    @Resource(name = "completeMerchantInfoEntityMapper")
    private CompleteMerchantInfoEntityMapper completeMerchantInfoMapper;

    /**
     * 保存商户信息
     */
    @Transactional
    public BaseResponse saveMerchantInfo(MerchantInfoEntity merchantInfo, List<MerchantBankInfoEntity> merchantBankInfoList) {
        BaseResponse response = new BaseResponse();
        // 根据全称判断商户是否存在, 存在则不进行录入
        MerchantInfoEntityCriteria condition = new MerchantInfoEntityCriteria();
        MerchantInfoEntityCriteria.Criteria criteria = condition.createCriteria();
        criteria.andFullNameEqualTo(merchantInfo.getFullName());
        List<MerchantInfoEntity> existed = merchantInfoMapper.selectByExample(condition);
        if(!CollectionUtils.isEmpty(existed)) {
            response.setCode(ResponseCode.ERROR);
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

    /**
     * 商户信息查询
     */
    public BaseResponse queryMerchantList(QueryMerchantRequest request) {
        MerchantInfoEntityCriteria condition = new MerchantInfoEntityCriteria();
        Page page = new Page(request.getSqlStart(), request.getPageSize());
        condition.setPage(page);
        List<CompleteMerchantInfoEntity> list = completeMerchantInfoMapper.selectByExample(condition);

        MerchantInfoEntityCriteria countCondition = new MerchantInfoEntityCriteria();
        int size = merchantInfoMapper.countByExample(countCondition);

        QueryResponse queryResponse = new QueryResponse();
        queryResponse.setRows(list);
        queryResponse.setTotalCount(size);

        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        response.setData(queryResponse);
        return response;
    }

    /**
     * 商户开通与关闭
     */
    public BaseResponse updateMerchantStatus(Integer merchantId, Integer status) {
        BaseResponse response = new BaseResponse();
        MerchantInfoEntity merchantInfoEntity = merchantInfoMapper.selectByPrimaryKey(merchantId);
        if(merchantInfoEntity == null) {
            response.error();
            response.setMessage("商户号" + merchantId + "不存在!");
            return response;
        }
        MerchantInfoEntity record = new MerchantInfoEntity();
        record.setId(merchantId);
        record.setStatus(status);
        merchantInfoMapper.updateByPrimaryKey(record);
        response.success();
        return response;
    }

    /**
     * 更新商户信息
     */
    public BaseResponse updateMerchant(MerchantInfoEntity merchantInfo, List<MerchantBankInfoEntity> merchantBankInfoList) {
        merchantInfoMapper.updateByPrimaryKeySelective(merchantInfo);
        if(!merchantBankInfoList.isEmpty()) {
            MerchantBankInfoEntityCriteria condition = new MerchantBankInfoEntityCriteria();
            MerchantBankInfoEntityCriteria.Criteria criteria = condition.createCriteria();
            criteria.andMerchantIdEqualTo(merchantInfo.getId());

            MerchantBankInfoEntity bankInfo = merchantBankInfoList.get(0);
            bankInfo.setId(null);
            bankInfo.setMerchantId(null);
            merchantBankInfoMapper.updateByExampleSelective(bankInfo, condition);
        }
        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        return response;
    }

    public void batchInsertMerchant(List<SaveMerchantInfo> saveMerchantInfoList) {
        for (SaveMerchantInfo saveMerchantInfo : saveMerchantInfoList) {
            saveMerchantInfo(saveMerchantInfo.getMerchantInfo(), saveMerchantInfo.getMerchantBankInfoEntityList());
        }
    }

}

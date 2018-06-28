package com.merchant.admin.service;

import com.google.common.collect.Lists;
import com.mcipay.page.Page;
import com.mcipay.persistence.entity.*;
import com.mcipay.persistence.entity.manual.CompleteMerchantInfoEntity;
import com.mcipay.persistence.mapper.*;
import com.merchant.admin.bo.*;
import com.merchant.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MerchantManageService {

    @Resource
    private MerchantInfoEntityMapper merchantInfoEntityMapper;

    @Resource
    private MerchantBankInfoEntityMapper merchantBankInfoEntityMapper;

    @Resource
    private CompleteMerchantInfoEntityMapper completeMerchantInfoEntityMapper;

    @Resource
    private MerchantUrlEntityMapper merchantUrlEntityMapper;

    @Resource
    private MerchantServiceChargeEntityMapper merchantServiceChargeMapper;

    @Resource
    private MerchantWaybillEntityMapper merchantWaybillEntityMapper;

    @Resource
    private MerchantTransactionEntityMapper merchantTransactionEntityMapper;

    @Autowired
    private SqlSession sqlSession;

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
        List<MerchantInfoEntity> existed = merchantInfoEntityMapper.selectByExample(condition);
        if(!CollectionUtils.isEmpty(existed)) {
            response.setCode(ResponseCode.ERROR);
            response.setMessage("商户[" + merchantInfo.getFullName() + "]已录入!");
            return response;
        }

        // 保存商户
        merchantInfo.setStatus(OpenCloseStatus.CLOSE.getStatus());
        merchantInfo.setOperatorId(SessionUtil.getUserId());
        merchantInfo.setCreateTime(new Date());
        merchantInfoEntityMapper.insert(merchantInfo);

        // 保存商户结算银行信息
        if(!CollectionUtils.isEmpty(merchantBankInfoList)) {
            for (MerchantBankInfoEntity merchantBankInfo : merchantBankInfoList) {
                merchantBankInfo.setMerchantId(merchantInfo.getId());
                merchantBankInfoEntityMapper.insert(merchantBankInfo);
            }
        }

        response.setCode(ResponseCode.SUCCESS);
        return response;
    }

    /**
     * 商户信息查询
     */
    public BaseResponse queryMerchantList(GetMerchantRequest request) {
        MerchantInfoEntityCriteria condition = new MerchantInfoEntityCriteria();
        MerchantInfoEntityCriteria.Criteria criteria = condition.createCriteria();
        if(request.getMerchantId() != null) {
            criteria.andIdEqualTo(request.getMerchantId());
        }
        if(StringUtils.isNoneBlank(request.getMerchantNameKey())) {
            criteria.andFullNameLike(request.getMerchantNameKey());
        }
        if(request.getPageNo() != null && request.getPageSize() != null) {
            Page page = new Page(request.getSqlStart(), request.getPageSize());
            condition.setPage(page);
        }
        List<CompleteMerchantInfoEntity> list = completeMerchantInfoEntityMapper.selectByExample(condition);

        MerchantInfoEntityCriteria countCondition = new MerchantInfoEntityCriteria();
        long size = merchantInfoEntityMapper.countByExample(countCondition);

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
        MerchantInfoEntity merchantInfoEntity = merchantInfoEntityMapper.selectByPrimaryKey(merchantId);
        if(merchantInfoEntity == null) {
            response.error();
            response.setMessage("商户号" + merchantId + "不存在!");
            return response;
        }
        OpenCloseStatus oc = OpenCloseStatus.getOpenCloseStatus(status);
        if(oc == null) {
            response.error();
            response.setMessage("状态[" + status + "]值不匹配!");
            return response;
        }
        MerchantInfoEntity record = new MerchantInfoEntity();
        record.setId(merchantId);
        record.setStatus(status);
        merchantInfoEntityMapper.updateByPrimaryKey(record);
        response.success();
        return response;
    }

    /**
     * 更新商户信息
     */
    public BaseResponse updateMerchant(MerchantInfoEntity merchantInfo, List<MerchantBankInfoEntity> merchantBankInfoList) {
        merchantInfoEntityMapper.updateByPrimaryKeySelective(merchantInfo);
        if(!merchantBankInfoList.isEmpty()) {
            MerchantBankInfoEntityCriteria condition = new MerchantBankInfoEntityCriteria();
            MerchantBankInfoEntityCriteria.Criteria criteria = condition.createCriteria();
            criteria.andMerchantIdEqualTo(merchantInfo.getId());

            MerchantBankInfoEntity bankInfo = merchantBankInfoList.get(0);
            bankInfo.setId(null);
            bankInfo.setMerchantId(null);
            merchantBankInfoEntityMapper.updateByExampleSelective(bankInfo, condition);
        }
        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        return response;
    }

    /**
     * 批量导入商户信息
     */
    public void batchInsertMerchant(List<SaveMerchantInfo> saveMerchantInfoList) {
        for (SaveMerchantInfo saveMerchantInfo : saveMerchantInfoList) {
            saveMerchantInfo(saveMerchantInfo.getMerchantInfo(), saveMerchantInfo.getMerchantBankInfoEntityList());
        }
    }

    /**
     * 商户URL列表获取
     */
    public BaseResponse getMerchantUrl(GetMerchantUrlRequest request) {
        MerchantUrlEntityCriteria condition = new MerchantUrlEntityCriteria();
        MerchantUrlEntityCriteria.Criteria criteria = condition.createCriteria();
        if(request.getMerchantId() != null) {
            criteria.andMerchantIdEqualTo(request.getMerchantId());
        }
        if(request.getPageNo() != null && request.getPageSize() != null) {
            Page page = new Page(request.getSqlStart(), request.getPageSize());
            condition.setPage(page);
        }
        List<MerchantUrlEntity> result = merchantUrlEntityMapper.selectByExample(condition);
        long count = merchantUrlEntityMapper.countByExample(condition);

        QueryResponse queryResponse = new QueryResponse();
        queryResponse.setRows(result);
        queryResponse.setTotalCount((int) count);

        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        response.setData(queryResponse);
        return response;
    }

    /**
     * 更新商户URL状态
     */
    public BaseResponse updateMerchantUrlStatus(Integer id, Integer status) {
        BaseResponse response = new BaseResponse();
        MerchantUrlStatus merchantUrlStatus = MerchantUrlStatus.getMerchantUrlStatus(status);
        if(merchantUrlStatus == null) {
            response.error();
            response.setMessage("非法 url status");
            return response;
        }
        MerchantUrlEntity merchantUrl = new MerchantUrlEntity();
        merchantUrl.setId(id);
        merchantUrl.setStatus(status);

        merchantUrlEntityMapper.updateByPrimaryKeySelective(merchantUrl);
        response.success();
        return response;
    }

    /**
     * 保存商户服务费
     */
    public BaseResponse saveMerchantServiceCharge(MerchantServiceCharge serviceCharge) {
        BaseResponse response = new BaseResponse();
        MerchantServiceChargeEntity record = new MerchantServiceChargeEntity();
        BeanUtils.copyProperties(serviceCharge, record);
        record.setStatus(OpenCloseStatus.OPEN.getStatus());
        merchantServiceChargeMapper.insert(record);

        response.success();
        return response;
    }

    /**
     * 运单审核列表=交易信息 + 运单信息
     */
    public BaseResponse getMerchantWaybillAuditList(GetMerchantWaybillAuditRequest request) {
        MerchantTransactionEntityCriteria condition = new MerchantTransactionEntityCriteria();
        MerchantTransactionEntityCriteria.Criteria criteria = condition.createCriteria();
        // 运单未提交的不进行展示
        criteria.andWaybillStatusNotEqualTo(WaybillStatus.INIT.getStatus());
        if(request.getMerchantTransactionId() != null) {
            criteria.andIdEqualTo(request.getMerchantTransactionId());
        }
        if(request.getWaybillStatus() != null) {
            criteria.andWaybillStatusEqualTo(request.getWaybillStatus());
        }
        if(request.getMerchantCreateTimeStart() != null && request.getMerchantCreateTimeEnd() != null) {
            criteria.andMerchantCreateTimeBetween(request.getMerchantCreateTimeStart(), request.getMerchantCreateTimeEnd());
        }
        if(request.getPageNo() != null && request.getPageSize() != null) {
            Page page = new Page(request.getSqlStart(), request.getPageSize());
            condition.setPage(page);
        }
        List<MerchantTransactionEntity> result = merchantTransactionEntityMapper.selectByExample(condition);
        List<Integer> transIdList = result.stream().map(transaction -> transaction.getId()).collect(Collectors.toList());

        MerchantWaybillEntityCriteria waybillCondition = new MerchantWaybillEntityCriteria();
        MerchantWaybillEntityCriteria.Criteria waybillCriteria = waybillCondition.createCriteria();
        waybillCriteria.andMerchantTransactionIdIn(transIdList);
        List<MerchantWaybillEntity> waybillList = merchantWaybillEntityMapper.selectByExample(waybillCondition);

        List<MerchantWaybillAudit> merchantWaybillAuditList = Lists.newArrayList();
        result.stream().forEach(transaction -> {
            MerchantWaybillAudit merchantWaybillAudit = new MerchantWaybillAudit();
            BeanUtils.copyProperties(transaction, merchantWaybillAudit);
            Optional<MerchantWaybillEntity> optional = waybillList.stream()
                    .filter(waybill -> waybill.getMerchantTransactionId().equals(transaction.getId())).findFirst();
            if(optional.isPresent()) {
                MerchantWaybillEntity merchantWaybillEntity = optional.get();
                merchantWaybillAudit.setWaybillNo(merchantWaybillEntity.getWaybillNo());
                merchantWaybillAudit.setMerchantCommitTime(merchantWaybillEntity.getMerchantCommitTime());
            }
            merchantWaybillAuditList.add(merchantWaybillAudit);
        });
        long count = merchantTransactionEntityMapper.countByExample(condition);

        QueryResponse queryResponse = new QueryResponse();
        queryResponse.setRows(merchantWaybillAuditList);
        queryResponse.setTotalCount((int) count);

        BaseResponse response = new BaseResponse(ResponseCode.SUCCESS);
        response.setData(queryResponse);
        return response;
    }

}

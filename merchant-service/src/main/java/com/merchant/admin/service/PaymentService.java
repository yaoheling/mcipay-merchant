package com.merchant.admin.service;

import com.mcipay.persistence.entity.PaymentJournalEntity;
import com.mcipay.persistence.mapper.PaymentJournalEntityMapper;
import com.merchant.util.PaymentStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

@Service
public class PaymentService {

    @Resource(name = "paymentJournalEntityMapper")
    private PaymentJournalEntityMapper paymentJournalMapper;

    public void payment(PaymentJournalEntity paymentJournal) {
        //TODO 异步请求
        Random random = new Random();
        Integer paymentStatus = null;
        if(random.nextBoolean()) {
            paymentStatus = PaymentStatus.SUCCESS.getStatus();
        } else {
            paymentStatus = PaymentStatus.ERROR.getStatus();
        }
        PaymentJournalEntity record = new PaymentJournalEntity();
        record.setId(paymentJournal.getId());
        record.setTransStatus(paymentStatus);
        record.setTransModifyTime(new Date());
        paymentJournalMapper.updateByPrimaryKeySelective(record);
        //TODO 通知商户交易成功
    }

}

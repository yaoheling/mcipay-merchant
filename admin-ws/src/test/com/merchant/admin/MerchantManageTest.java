package com.merchant.admin;

import com.mcipay.persistence.entity.MerchantBankInfoEntity;
import com.mcipay.persistence.entity.MerchantInfoEntity;
import com.merchant.admin.service.MerchantManageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MerchantManageTest {

    @Autowired
    private MerchantManageService merchantManageService;

    @Test
    public void saveMerchantInfo() {
        MerchantInfoEntity merchantInfo = new MerchantInfoEntity();
        MerchantBankInfoEntity merchantBankInfo = new MerchantBankInfoEntity();
        merchantManageService.saveMerchantInfo(merchantInfo, merchantBankInfo);
    }

}

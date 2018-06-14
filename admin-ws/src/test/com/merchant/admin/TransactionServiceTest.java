package com.merchant.admin;

import com.merchant.admin.bo.MerchantTransactionRequest;
import com.merchant.admin.service.TransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionServiceTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void saveMerchantInfo() {
        for (int i = 0; i < 100; i++) {
            MerchantTransactionRequest request = new MerchantTransactionRequest();
            ObjectToJsonTest.mock(request);
            request.setMerchantId(12);
            transactionService.transactionAgent(request);
        }
    }

}

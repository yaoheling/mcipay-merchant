package com.merchant.admin;

import com.merchant.util.JsonUtil;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

public class ObjectToJsonTest {

    public static void mock(Object param) {
        try {
            Field[] fields = param.getClass().getDeclaredFields();
            Random random = new Random();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);

                Object initValue = field.get(param);
                if(initValue != null) continue;

                Object value = field.getName() + "&" + random.nextInt(100);
                if(field.getType().equals(Date.class)) {
                    value = new Date();
                } else if(field.getType().equals(BigDecimal.class)) {
                    double dd = random.nextDouble() + Math.abs(random.nextInt(99999));
                    value = new BigDecimal(dd).setScale(2, BigDecimal.ROUND_HALF_DOWN);
                } else if(field.getType().equals(Integer.class)) {
                    value = Math.abs(random.nextInt());
                }
                field.set(param, value);
            }
            System.out.println(JsonUtil.toJsonAndFormat(param));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

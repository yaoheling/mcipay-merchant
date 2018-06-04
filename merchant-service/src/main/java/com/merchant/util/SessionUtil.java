package com.merchant.util;

import java.util.UUID;

/**
 * 用户登录信息获取工具类
 */
public class SessionUtil {

    public static String getUserId() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

}

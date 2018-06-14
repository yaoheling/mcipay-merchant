package com.merchant.util;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author hongye.lv
 * @date 2018/06/14
 **/
public class MD5 {

    public static String MD5(String text) {
        return DigestUtils.md5Hex(text);
    }

}

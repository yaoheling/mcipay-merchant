package com.merchant.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongye.lv
 * @date 2018/06/15
 **/
public class DataUtil {

    /**
     * 根据数字逗号分隔字符串返回集合
     * @param text
     * @return
     */
    public static List<Integer> getListByComma(String text) {
        List<Integer> list = null;
        if (StringUtils.isNotBlank(text)) {
            String[] arr = text.split(",");
            if (arr != null && arr.length > 0) {
                list = new ArrayList<Integer>();
                for (int i = 0; i < arr.length; i++) {
                    if (StringUtils.isBlank(arr[i])) {
                        continue;
                    }
                    list.add(Integer.parseInt(arr[i].trim()));
                }
            }
        }
        return list;
    }

}

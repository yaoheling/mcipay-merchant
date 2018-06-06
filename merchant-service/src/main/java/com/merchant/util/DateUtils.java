package com.merchant.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author hongye.lv
 * @date 2018/06/05
 **/
public class DateUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

    public final static String FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public final static String FORMAT_YYYYGMMGDD = "yyyy/MM/dd";
    public final static String FORMAT_YYYY_MM_DD_HH_MM_SS_12 = "yyyy-MM-dd hh:mm:ss";
    public final static String FORMAT_YYYY_MM_DD_HH_MM_SS_24 = "yyyy-MM-dd HH:mm:ss";
    public final static String FORMAT_YYYY_MM_DD_HH_MM_24 = "yyyy-MM-dd HH:mm";
    public final static String FORMAT_YYYYMMDD = "yyyyMMdd";
    public final static String FORMAT_YYYY_MM = "yyyy-MM";

    /**
     * 日期->字符串
     * @param date
     * @param format
     * @return
     */
    public static String dateToString(Date date, String format){
        if(isEmpty(date)){
            return null;
        }
        if(StringUtils.isBlank(format)){
            format = FORMAT_YYYY_MM_DD;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            String dateString = sdf.format(date);
            return dateString;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 字符串转换成日期
     * @param date
     * @param format
     * @return
     */
    public static Date stringToDate(String date, String format) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            LOGGER.error("日期转换错误:{}",e.getMessage());
        }
        return null;
    }

    /**
     * 判断日期为空
     * @param date
     * @return
     */
    public static boolean isEmpty(Date date){
        if(null==date){
            return true;
        }
        return false;
    }

    /**
     * 根据指定时间获取特定时间
     * @param startDate
     * @return
     */
    public static Date getSpecificTime(String startDate, Integer day){
        Date sDate = DateUtils.stringToDate(startDate, DateUtils.FORMAT_YYYY_MM_DD);
        return getSpecificTime(sDate, day);
    }

    /**
     * 根据指定时间获取特定时间
     * @param day
     * @return
     */
    public static Date getSpecificTime(Date date,int day){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, day);
        return  c.getTime();
    }

}

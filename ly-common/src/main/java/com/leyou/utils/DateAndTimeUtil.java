package com.leyou.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间格式转换处理类
 */
public class DateAndTimeUtil {

    //String-->Date  时间字符串转为 -yyyy-MM-dd HH:mm:ss-的时间格式
    public Date strToDate(String dateStr) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if ("".equals(dateStr) || dateStr == null || "null".equals(dateStr)) {
            date = new Date();
        } else {
            try {
                date = format.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }

    //Date-->String   当前时间转换为年月日时分秒格式 eg：new Date()-->20210425105647
    public static String dateToStringNum(Date nowDate) {
        if (nowDate == null) {
            nowDate = new Date();
        }
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = null;
        dateString = format.format(nowDate);
        return dateString;
    }

    // Date-->String   当前时间转换为年月日时分秒格式 eg：new Date()-->20210425
    public String  dateToStringYMDNum(Date nowDate) {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateString = null;
        dateString = format.format(nowDate);
        return dateString;
    }

    // Date-->String   当前时间转换为 年/月/日 时:分:秒 eg：new Date()-->2021/04/25 11:04:52
    public String  dateFormat2Str1(Date nowDate) {
        if (nowDate == null) {
            nowDate = new Date();
        }
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(nowDate);
    }

    // Date-->String   当前时间转换为 年-月-日 时:分:秒 eg：new Date()-->2021-04-25 11:04:52
    public static String dateFormat2Str2(Date nowDate) {
        if (nowDate == null) {
            nowDate = new Date();
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(nowDate);
    }

    // Date-->String   当前时间转换为 年-月-日  eg：new Date()-->2021-04-25
    public String dateToStringYMD(Date nowDate) {
        if (nowDate == null) {
            nowDate = new Date();
        }
        DateFormat dateFormat2Str2 = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = null;
        dateString = dateFormat2Str2.format(nowDate);
        return dateString;
    }


    // Date-->String   当前时间转换为 时:分:秒  eg：new Date()-->11:04:52
    public String dateToStringHMS(Date nowDate) {
        if (nowDate == null) {
            nowDate = new Date();
        }
        return new SimpleDateFormat("HH:mm:ss").format(nowDate);
    }

    // 判断上午下午 1-上午，2-下午
    public int getTimeSlot() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        return hour >= 12 ? 2 : 1;
    }
}
package com.tyht.str;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Formatter;
import java.util.concurrent.ForkJoinPool;
import java.util.zip.DataFormatException;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/30 14:47
 */
public class Localtime {
    //预定义的标准格式
    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    //格式化
    LocalDateTime localDateTime = LocalDateTime.now();
    String str = formatter.format(localDateTime);
    //解析
    TemporalAccessor parse =  formatter.parse("2019-02-18T15:42:18.797");
    //本地化相关格式：ofLocalizedDateTime()
    //FormatStyle.LONG FormatStyle.MEDIUM FormatStyle.SHORT
    //本地化相关格式：ofLocalizedDate()
    //FormatStyle.FULL FormatStyle.LONG FormatStyle.MEDIUM FormatStyle.SHORT
}

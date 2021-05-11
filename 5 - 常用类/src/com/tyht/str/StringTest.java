package com.tyht.str;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.parser.Parser;
import java.net.SocketTimeoutException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/27 16:03
 */
public class StringTest {
    @Test
    public void test4() {
        //Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
    }

    @Test
    public void test3() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        String str = "21-3-29";//设置格式
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s3 == s4);//false
    }

    @Test
    public void test() {
        String s = "helloworld";
        String s1 = "hello";
        String s2 = "world";
        //返回字符串的长度
        System.out.println(s.length());
        //返回索引处的字符
        System.out.println(s.charAt(0));
        //返回是否是空字符串
        System.out.println(s.isEmpty());
        //使用默认语言环境，将字符串转换为小写
        System.out.println(s.toLowerCase(Locale.ROOT));
        //使用默认语言环境，将字符串转换为大写
        System.out.println(s.toUpperCase(Locale.ROOT));
        //返回字符串的副本，忽略前导空白和尾部空白
        System.out.println(s.trim());
        //比较字符串的内容是否相同
        System.out.println(s1.equals(s2));
        //忽略大小写，比较字符串的内容是否相同
        System.out.println(s1.equalsIgnoreCase(s2));
        //指定字符串连接到末尾
        System.out.println(s1.concat(s2));
        //比较两个字符串的大小
        System.out.println(s1.compareTo(s2));
        //返回一个新的字符串，从指定处开始截取
        System.out.println(s1.substring(2));
        //返回一个新的字符串，从指定处开始指定处结束
        System.out.println(s2.substring(2, 4));

        //测试字符串是否以指定后缀结束
        System.out.println(s.endsWith("world"));
        //测试字符串是否以指定前缀开始
        System.out.println(s.startsWith("hello"));
    }
}

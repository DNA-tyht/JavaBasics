package com.tyht.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/16 21:15
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);
            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

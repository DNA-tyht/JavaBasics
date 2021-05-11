package com.tyht.java1;

import org.junit.Test;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 16:42
 */
public class GenericTest2 {

    @Test
    public void test1() {
        Order order1 = new Order();
        order1.setOrderT(123);
        order1.setOrderT("abc");

        Order<String> order2 = new Order<String>();
        order2.setOrderT("abc");
    }

    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        sub1.setOrderT(1123);

    }
}

package com.tyht.java2;

import org.junit.Test;

import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 17:52
 */
public class DAOTest {
    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> forList = dao1.getForList(1);

    }
}

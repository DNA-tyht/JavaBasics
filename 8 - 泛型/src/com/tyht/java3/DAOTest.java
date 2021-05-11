package com.tyht.java3;

import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 21:19
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001", new User(1, 34 ,"tom"));
        dao.save("1002", new User(2, 14 ,"jerry"));
        dao.save("1003", new User(3, 24 ,"kitty"));

        List<User> list = dao.list();
        list.forEach(System.out::println);
    }
}

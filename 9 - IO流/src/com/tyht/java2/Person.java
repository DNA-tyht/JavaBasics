package com.tyht.java2;

import java.io.Serializable;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/16 8:37
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public static final long serialVersionUID = 475463534532L;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

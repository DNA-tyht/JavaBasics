package com.tyht.service;

/**
 * @Description 表示员工的状态
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 13:52
 */
public enum Status {
    FREE, BUSY, VOCATION;
}

//public class Status {
//    private final String NAME;
//
//    private Status(String name) {
//        this.NAME = name;
//    }
//
//    public static final Status FREE = new Status("FREE");
//    public static final Status BUSY = new Status("BUSY");
//    public static final Status VOCATION = new Status("VOCATION");
//
//    @Override
//    public String toString() {
//        return NAME;
//    }
//
//    public String getNAME() {
//        return toString();
//    }
//}

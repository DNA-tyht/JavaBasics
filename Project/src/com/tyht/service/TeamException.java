package com.tyht.service;

import sun.misc.Cache;

/**
 * @Description 自定义异常类
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:43
 */
public class TeamException extends Exception {
    static final long serialVersionUID =  -7034897190745766939L;

    public TeamException() {

    }

    public TeamException(String msg) {
        super(msg);
    }

}

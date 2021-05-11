package com.tyht.java2;

import java.util.List;

/**
 * @Description data(base) access object
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 17:44
 */
public class DAO<T> {
    //添加一条记录
    public void add(T t) {

    }
    //删除一条记录
    public boolean remover(int index) {
        return false;
    }
    //修改一条记录
    public void update(int index, T t) {

    }
    //查询一条记录
    public T getIndex(int index) {
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index) {
        return null;
    }

    public <E> E getValue() {
        return null;
    }

}

package com.tyht.java1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 16:37
 */
public class Order<T> {
    String orderName;
    int orderId;
    T orderT;

    public Order() {
        //T[] arr = new T[10];
        //编译可通过
        T[] arr = (T[]) new Object[10];
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public <E> List<E> copyFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}

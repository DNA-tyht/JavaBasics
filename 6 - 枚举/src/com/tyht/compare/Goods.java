package com.tyht.compare;

import java.util.Arrays;

/**
 * @Description 商品类
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/30 15:31
 */
public class Goods implements Comparable {
    public static void main(String[] args) {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("lenovo", 34);
        arr[1] = new Goods("dell", 43);
        arr[2] = new Goods("xiaomi", 12);
        arr[3] = new Goods("huawei", 43);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private String name;
    private double price;

    //指明商品比较大小的方式
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                return -1;
            } else {
                //return 0;
                return this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("传入的数据不一致");
    }

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

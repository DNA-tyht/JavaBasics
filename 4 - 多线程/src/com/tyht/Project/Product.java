package com.tyht.Project;

/**
 * @Description 生产者
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 19:40
 */
public class Product implements Runnable {
    private Clerk clerk = new Clerk();

    public Product(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 开始生产");
        while (true) {
            clerk.produceProduct();
        }
    }
}

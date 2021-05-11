package com.tyht.Project;

/**
 * @Description 消费者
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 19:41
 */
public class Customer implements Runnable {
    private Clerk clerk = new Clerk();

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 开始消费");
        while (true) {
            clerk.consumeProduct();
        }
    }
}

package com.tyht.Test;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/25 14:51
 */
public class ThreadMethod {

    public static void main(String[] args) {
        HelloThread h = new HelloThread();
        h.setName("线程一");
        h.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                Thread.yield();
            }
        }
    }
}

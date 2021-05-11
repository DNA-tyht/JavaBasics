package com.tyht.Test;

import sun.rmi.runtime.NewThreadAction;

/**
 * @Description 线程安全
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/25 15:50
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Window implements Runnable {
    private static int ticket = 1;
    private static Object obj = new Object();

    @Override
    public void run() {
        for (ticket = 1; ticket <= 100; ticket++) {
            synchronized (obj){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 买票，票号为：" + ticket);
            }
        }
    }
}
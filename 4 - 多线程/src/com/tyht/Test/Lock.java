package com.tyht.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 17:09
 */
public class Lock {
    public static void main(String[] args) {
        Window1 window1 = new Window1();
        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);
        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Window1 implements Runnable {
    private static int ticket = 1;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        for (ticket = 1; ticket <= 100; ticket++) {
            try {
                lock.lock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 买票，票号为：" + ticket);
            } finally {
                lock.unlock();
            }
        }
    }
}
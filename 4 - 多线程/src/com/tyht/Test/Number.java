package com.tyht.Test;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 18:19
 */
public class Number implements Runnable{
    private int num = 0;

    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (num = 0; num < 100; num++) {
            synchronized (this) {
                notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + num);
            }
        }
    }
}

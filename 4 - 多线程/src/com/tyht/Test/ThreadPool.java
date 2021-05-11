package com.tyht.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/27 9:14
 */
public class ThreadPool {
    public static void main(String[] args) {
        //提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //执行指定线程的操作，需要提供 Runnable 接口或 Callable 接口实现类的对象
        service.execute(new NumberThread());//适用于Runnable
        service.submit(new NumberThread());//适用于Callable
        //关闭线程池
        service.shutdown();
    }
}

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

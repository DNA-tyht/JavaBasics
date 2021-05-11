package com.tyht.Test;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 20:14
 */
public class ThreadNew {
    public static void main(String[] args) {
        //创建 Callable 接口实现类的对象
        NumThread numThread = new NumThread();
        //将此 Callable 接口将实现类的对象作为传递到 FutureTask 构造器中
        FutureTask<Integer> futureTask = new FutureTask<Integer>(numThread);
        //将 FutureTask 的对象作为参数传递到 Thread 类的构造器，并 start
        new Thread(futureTask).start();

        try {
            //获取 Callable 方法中的返回值
            //get() 返回值即为 FutureTask 构造器参数 Callable 实现类重写的 call 的返回值
            Integer sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

//创建一个实现 Callable 实现类
class NumThread implements Callable {
    //实现 call 方法，将次现场需要执行的操作声明在 call 中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

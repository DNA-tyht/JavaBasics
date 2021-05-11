package com.tyht.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description 练习
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 17:25
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        Thread th1 = new Thread(customer1);
        Thread th2 = new Thread(customer2);
        th1.start();
        th2.start();
    }
}

class Account {
    private double balance = 0;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amt) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(amt > 0)
            balance += amt;
        System.out.println("存款成功，余额为：" + balance);
    }
}

class Customer implements Runnable {
    private Account acct;
    private ReentrantLock lock = new ReentrantLock();

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
package com.tyht.Test;

/**
 * @Description 单例懒汉式（线程安全版）
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 16:22
 */
public class BankTest {

}

class Bank {
    private static AccountTest instance = null;

    private Bank() {
    }

    public static AccountTest getInstance() {
        if(instance == null) {
            synchronized (AccountTest.class) {
                if (instance == null) {
                    instance = new AccountTest();
                }
            }
        }
        return instance;
    }
}

package com.tyht.Project;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/26 19:49
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Product product = new Product(clerk);
        Customer customer = new Customer(clerk);
        Thread t1 = new Thread(product);
        Thread t2 = new Thread(customer);
        t1.setName("生产者");
        t2.setName("消费者");
        t1.start();
        t2.start();
    }
}

package com.tyht.java3;

import com.tyht.java2.Customer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 18:00
 */
public class GenericTest {
    @Test
    public void test1() {
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;

//        list = list1;
//        list = list2;
//        print(list1);
//        print(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("aa");
        list3.add("bb");
        list3.add("cc");
        list = list3;
        //添加
        //不能向List<?>内部添加数据，除了null
        //list.add("dd");
        //读取
        Object o = list.get(0);
        System.out.println(o);
    }

    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

//    @Test
//    public void test2() {
//        List<? extends Person> list1 = null;
//        List<? super Person> list2 = null;
//
//        List<Student> list3 = null;
//        List<Person> list4 = null;
//        List<Object> list5 = null;
//
//        list1 = list3;
//        list1 = list4;
//        //list1 = list5;
//
//        //list2 = list3;
//        list2 = list4;
//        list2 = list5;
//
//        //读取数据
//        list1 = list3;
//        Person person = list1.get(0);
//        //写入数据
//
//    }
}

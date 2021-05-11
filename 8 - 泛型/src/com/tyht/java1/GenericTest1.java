package com.tyht.java1;

import org.junit.Test;

import java.util.*;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/13 15:58
 */
public class GenericTest1 {

    //在集合中使用泛型前的情况
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(78);
        list.add(44);
        list.add(55);
        list.add(66);
        //类型不安全
        //list.add("tom");
        for (Object score: list) {
            //强转时，肯出现 ClassCastException
            int styScore = (int) score;
        }
    }

    //在集合中使用泛型后的情况
    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //编译时进行类型检查，保证数据的安全
        list.add(78);
        list.add(44);
        list.add(55);
        list.add(66);

        //方式一：加强for循环
        for (Integer score: list) {
            int stuScore = score;
            System.out.println(stuScore);
        }

        //方式二：迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //以HashMap为例
    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("tom", 87);
        map.put("jerry", 87);
        map.put("jack", 67);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + value);
        }
    }
}

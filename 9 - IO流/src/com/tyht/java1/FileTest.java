package com.tyht.java1;

import org.junit.Test;

import java.io.File;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/14 16:27
 */
public class FileTest {

    @Test
    public void test1() {
        //构造器1
        File file1 = new File("out.txt");
        File file2 = new File("E:\\学习\\JavaBasics\\9 - IO流");
        //构造器2
        File file3 = new File("E:\\学习", "JavaBasics");
        //构造器3
        File file4 = new File(file3, "h1.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
    }
}

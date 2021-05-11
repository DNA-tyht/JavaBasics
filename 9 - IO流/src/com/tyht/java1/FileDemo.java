package com.tyht.java1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/14 22:00
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\out.txt");
        //创建一个与file同目录下的haha.txt文件
        File file1 = new File(file.getParent(), "haha.txt");
        boolean newFile = file1.createNewFile();
        if (newFile) {
            System.out.println(file1.getName());
        }
        file1.delete();
    }
}

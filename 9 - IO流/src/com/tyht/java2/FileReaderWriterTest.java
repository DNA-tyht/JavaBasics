package com.tyht.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 9:09
 */
public class FileReaderWriterTest {
    //将hello.txt文件内容读入程序并输出到控制台
    @Test
    public void testFileReader1() {
        FileReader fr = null;
        try {
            //实例化File类对象，指明操作文件
            //读入文件不存在会抛出FileNotFoundException异常
            File file = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\out.txt");
            System.out.println(file.getAbsolutePath());
            //提取具体的流
            fr = new FileReader(file);
            //数据的输入
            //read()返回读入的一个字符，到达文件末尾时返回-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //实例化File类对象
            File file = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\out.txt");
            //FileReader流的实例化
            fr = new FileReader(file);
            //读入操作
            //每次读取5个字符
            char[] cbuf = new char[5];
            int len = fr.read(cbuf);
            //返回作为整数读取的字符，范围在0到65535间，如果已到达流的末尾，则返回 -1
            while (len != -1) {
                //方式一
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
                len = fr.read(cbuf);

                //方式二
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //从内存中写出数据到硬盘的文件
    @Test
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            //实例化File类的对象
            File file = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\out.txt");
            //提供FileWriter类的对象，用于数据的写出
            fw = new FileWriter(file);
            //写出的操作
            fw.write("I have a dream\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流的关闭
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\in.txt");
            File destFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\out.txt");
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            char[] cbuf = new char[5];
            int length = fr.read(cbuf);
            while (length != -1) {
                fw.write(cbuf, 0, length);
                length = fr.read(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

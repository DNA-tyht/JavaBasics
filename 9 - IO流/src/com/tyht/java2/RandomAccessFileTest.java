package com.tyht.java2;

import com.sun.org.apache.bcel.internal.generic.F2D;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/16 9:24
 */
public class RandomAccessFileTest {
    @Test
    public void test1() {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("src\\小野猪.jpg"), "r");
            raf2 = new RandomAccessFile(new File("src\\小野猪1.jpg"), "rw");
            byte[] buffer = new byte[1024];
            int length = raf1.read(buffer);
            while (length != -1) {
                raf2.write(buffer, 0, length);
                length = raf1.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("src\\random.txt"), "rw");
            raf1.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("src\\hello.txt"), "rw");
            raf1.seek(3);
            //保存指针3后的所有数据到StringBuilder
            StringBuilder builder = new StringBuilder((int) new File("src\\hello").length());
            byte[] buffer = new byte[16];
            int length = raf1.read(buffer);
            while (length != -1) {
                builder.append(new String(buffer, 0, length));
                length = raf1.read(buffer);
            }
            //调回指针，写入"xzy"
            raf1.seek(3);
            raf1.write("xyz".getBytes());
            //将StringBuilder中的数据写入到文件中
            raf1.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

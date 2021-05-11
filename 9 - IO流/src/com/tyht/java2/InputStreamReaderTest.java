package com.tyht.java2;

import org.junit.Test;

import java.io.*;
import java.time.temporal.ChronoUnit;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 19:59
 */
public class InputStreamReaderTest {

    @Test
    public void test1() {
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("src/in.txt");
            //使用的字符集取决于文件保存时使用的字符集
            isr = new InputStreamReader(fis, "UTF-8");
            char[] cbuf = new char[16];
            int length = isr.read(cbuf);
            while (length != -1) {
                String str = new String(cbuf, 0, length);
                System.out.print(str);
                length = isr.read(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("src/in.txt");
            File file2 = new File("src/in_gbk.txt");
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "gbk");
            char[] cbuf = new char[16];
            int length = isr.read(cbuf);
            while (length != -1) {
                osw.write(cbuf, 0, length);
                length = isr.read(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

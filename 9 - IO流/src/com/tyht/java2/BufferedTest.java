package com.tyht.java2;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 16:17
 */
public class BufferedTest {
    @Test
    public void testBufferedStream() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪.jpg");
            File destFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪1.jpg");
            //造结点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[16];
            int lenght = bis.read(buffer);
            while (lenght != -1) {
                bos.write(buffer, 0, lenght);
                lenght = bis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先关闭外层的流，再关闭内层的流
            //在关闭外层流的同时，内层流会自动关闭
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        fis.close();
//        fos.close();
        }
    }

    @Test
    public void testBufferedReaderBufferedWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("E:\\学习\\JavaBasics\\9 - IO流\\src\\hello.txt"));
            bw = new BufferedWriter(new FileWriter("E:\\学习\\JavaBasics\\9 - IO流\\src\\hi.txt"));

            //方式一：使用char[]数组
            char[] cbuf = new char[4];
            int length = br.read(cbuf);
            while (length != -1) {
                bw.write(cbuf, 0, length);
                length = br.read(cbuf);
            }

            //方式二：使用String
            String data = br.readLine();
            while (data != null) {
                //data中不包含换行符
                bw.write(data + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

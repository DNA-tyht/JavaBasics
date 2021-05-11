package com.tyht.java2;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 17:25
 */
public class PicTest {

    //图片的加密
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪.jpg");
            fos = new FileOutputStream("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪secret.jpg");
            byte[] buffer = new byte[16];
            int length = fis.read(buffer);
            while (length != -1) {
                //对字节数据修改
                for (int i = 0; i < length; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }
                fos.write(buffer, 0, length);
                length = fis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //获取文本上每个字符出现的次数
    @Test
    public void test2() {
        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            Map<Character, Integer> map = new HashMap<>();
            fr = new FileReader("E:\\学习\\JavaBasics\\9 - IO流\\src\\hello.txt");
            int c = fr.read();
            while (c != -1) {
                char ch = (char) c;
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
                c = fr.read();
            }
            //将map的数据存入hi中
            bw = new BufferedWriter(new FileWriter("E:\\学习\\JavaBasics\\9 - IO流\\src\\hi.txt"));
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                switch (entry.getKey()) {
                    case ' ':
                        bw.write("空格 = " + entry.getValue());
                        break;
                    case '\t':
                        bw.write("tab = " + entry.getValue());
                        break;
                    case '\r':
                        bw.write("回车 = " + entry.getValue());
                        break;
                    case '\n':
                        bw.write("换行 = " + entry.getValue());
                        break;
                    default:
                        bw.write(entry.getKey() + " = " + entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
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

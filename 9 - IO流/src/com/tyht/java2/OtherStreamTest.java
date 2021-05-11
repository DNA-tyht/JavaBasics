package com.tyht.java2;

import org.junit.Test;

import java.io.*;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 20:57
 */
public class OtherStreamTest {
    //标准的输入输出流
    @Test
    public void test1() {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true) {
                String data = br.readLine();
                if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")) {
                    break;
                }
                String toUpperCase = data.toUpperCase();
                System.out.println(toUpperCase);
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
        }
    }

    //打印流
    @Test
    public void test2() {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("src\\out.txt.txt"));
            //创建打印输出流，设置为自动刷新模式（写入'\n'时刷新缓冲区）
            ps = new PrintStream(fos, true);
            if (ps != null)//将标准输出流改称文件输出
                System.setOut(ps);
            for (int i = 0; i <= 255; i++) {//输出ASCII字符
                System.out.println((char) i);
                if (i % 50 == 0)//每50个数据一行
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null)
                ps.close();
        }
    }

    //数据流
    @Test
    public void test3() {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("src/out.txt"));
            dos.writeUTF("刘德华");
            dos.writeInt(23);
            dos.writeBoolean(true);
            //刷新操作，将内存中的数据写入文件
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test4() {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("src/out.txt"));
            String name = dis.readUTF();
            int age = dis.readInt();
            boolean ismale = dis.readBoolean();
            System.out.println(name);
            System.out.println(age);
            System.out.println(ismale);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

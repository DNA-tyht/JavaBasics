package com.tyht.java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/15 15:41
 */
public class FileInputOutputTest {

    //输入文本文件
    @Test
    public void testFileInputStream () {
        FileInputStream fis = null;
        try {
            File file = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\in.txt");
            fis = new FileInputStream(file);
            byte[] buffer = new byte[5];
            int length = fis.read(buffer);
            while (length != -1) {
                String str = new String(buffer, 0, length);
                System.out.print(str);
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
        }
    }

    //对图片进行复制
    @Test
    public void testFileInputOutput() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪.jpg");
            File destFile = new File("E:\\学习\\JavaBasics\\9 - IO流\\src\\小野猪1.jpg");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[5];
            int length = fis.read(buffer);
            while (length != -1) {
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

    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int length = fis.read(buffer);
            while (length != -1) {
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

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();
        String srcPath = "D:\\FileRecv\\1-5 创建开发JSP站点的Maven项目（含Web项目的运行）.mp4";
        String destPath = "E:\\视频.mp4";
        copyFile(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println("操作花费时间为：" + (end - start));
    }
}

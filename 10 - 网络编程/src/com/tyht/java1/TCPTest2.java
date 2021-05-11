package com.tyht.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/16 22:21
 */
//客户端发送文件给服务端，服务端将文件保存在本地
public class TCPTest2 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            //创建Socket对象，指明服务器端的IP和端口号
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("src\\小野猪.jpg"));
            byte[] buffer = new byte[1024];
            int length = fis.read(buffer);
            while (length != -1) {
                os.write(buffer, 0, length);
                length = fis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //服务端
    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //指明自己的端口号
            ss = new ServerSocket(9090);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("src\\小野猪1.jpg"));
            byte[] buffer = new byte[1024];
            int length = is.read(buffer);
            while (length != -1) {
                fos.write(buffer, 0, length);
                length = is.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

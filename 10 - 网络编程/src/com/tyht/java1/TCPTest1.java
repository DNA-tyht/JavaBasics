package com.tyht.java1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/16 21:55
 */
//客户端发送信息给服务端，服务端将数据显示在控制台上
public class TCPTest1 {
     //客户端
     @Test
     public void client() {
          Socket socket = null;
          OutputStream os = null;
          try {
               //创建Socket对象，指明服务器端的IP和端口号
               InetAddress inet = InetAddress.getByName("127.0.0.1");
               socket = new Socket(inet, 8888);
               os = socket.getOutputStream();
               os.write("我是客户端".getBytes());
          } catch (IOException e) {
               e.printStackTrace();
          } finally {
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
          ByteArrayOutputStream baos = null;
          try {
               //指明自己的端口号
               ss = new ServerSocket(8888);
               socket = ss.accept();
               is = socket.getInputStream();
               baos = new ByteArrayOutputStream();
               byte[] buffer = new byte[16];
               int length = is.read(buffer);
               while (length != -1) {
                    baos.write(buffer, 0, length);
                    length = is.read(buffer);
               }
               System.out.println(baos.toString());
          } catch (IOException e) {
               e.printStackTrace();
          } finally {
               if (baos != null) {
                    try {
                         baos.close();
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

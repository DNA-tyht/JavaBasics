package com.tyht.view;

import java.util.Scanner;

/**
 * @Description 方便的实现键盘访问
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 12:56
 */
public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);
    
    /**
    * @Description 读取键盘，用户输入 1-4 中的任意字符
    * @Return 返回输入字符
    * @Author 脱氧核糖
    * @Date 2021/4/10 13:01
    */
    public static char readMenuSelection() {
        char c;
        while (true) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.println("选择错误，请重新输入：");
            } else
                break;
        }
        return c;
    }

    /**
    * @Description 读取键盘，用户按回车键继续
    * @Return void
    * @Author 脱氧核糖
    * @Date 2021/4/10 13:05
    */
    public static void readReturn() {
        System.out.println("按回车键继续……");
        readKeyBoard(100, true);
    }

    /**
    * @Description 读取键盘，用户输入整数
    * @Return 返回输入整数
    * @Author 脱氧核糖
    * @Date 2021/4/10 13:11
    */
    public static int readInt() {
        int n;
        while (true) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
    * @Description 读取键盘，用户输入'Y'或'N'
    * @Return 返回输入字符
    * @Author 脱氧核糖
    * @Date 2021/4/10 13:20
    */
    public static char readConfirmSelection() {
        char c;
        while (true) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else
                System.out.println("选择错误，请重新输入：");
        }
        return c;
    }

    /**
    * @Description 读取键盘的输入
    * @Return [limit, blankReturn]
    * @Author 脱氧核糖
    * @Date 2021/4/10 13:21
    */
    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn)
                    return line;
                else
                    continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}

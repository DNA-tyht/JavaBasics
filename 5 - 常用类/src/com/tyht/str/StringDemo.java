package com.tyht.str;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/3/30 16:11
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "gsfagfogig";

    }

    public String reverse(String str, int start, int end) {
        char[] arr = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return new String(arr);
    }
}

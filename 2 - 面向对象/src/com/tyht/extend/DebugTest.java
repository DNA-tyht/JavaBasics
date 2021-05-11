package com.tyht.extend;

import java.util.Scanner;

public class DebugTest {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 56, 3, 4, 26, 89 };
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数据：");
		int a = sc.nextInt();
		System.out.println(search(arr, a));
	}

	public static int search(int[] arr,int a){
		
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
}

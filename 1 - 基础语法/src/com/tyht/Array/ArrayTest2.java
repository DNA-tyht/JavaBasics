package com.tyht.Array;

public class ArrayTest2 {
	
	public static void main(String [] args) {
		
		//正确的写法
		int[][] arr = new int[][] {{1, 2, 3}, {4, 5}, {6}};
		String[][] arr1 = new String[3][2];
		arr1 = new String[1][1];//重新分配地址
		
		String[][] arr2 = new String[3][];
		//使用前初始化
		arr2[1] = new String[4];
		
		//二维数组的默认初始化
		int[][] a = new int[3][4];
		System.out.println(a[0]);//首地址值
		System.out.println(a[0][0]);//0
		
		String[][] s = new String[3][4];
		System.out.println(s[0]);//首地址值
		System.out.println(s[0][0]);//null
		
		double[][] d = new double[3][];
		d[0] = new double[3];//不写空指针异常
		System.out.println(d[0]);//首地址值
		System.out.println(d[0][0]);//0.0
		
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
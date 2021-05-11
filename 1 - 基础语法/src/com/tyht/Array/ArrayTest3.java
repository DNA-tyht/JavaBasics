package com.tyht.Array;

public class ArrayTest3 {
	
	public static void main(String [] args) {
		
		int[] arr1, arr2;
		arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		//数组这样复制会使两个数组指向同一地址
		//不能称作数组的复制
		arr2 = arr1;
		for(int i = 0; i < arr2.length; i++) {
			if(i % 2 == 0)
				arr2[i] = i;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}	
	}
}

package com.tyht.Array;

public class ArrayException {

	public static void main(String[] args) {
		
		//数组角标越界异常 ArrayIndexOutOfBoundExcetion
		int[] arr = new int[4];
		for(int i = 0; i <= arr.length; i++) {
			
		}
		
		//空指针异常 NullPointerException
		arr = null;
		System.out.println(arr[0]);
	}
}

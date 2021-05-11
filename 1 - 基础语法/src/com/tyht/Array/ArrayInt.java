package com.tyht.Array;

public class ArrayInt {
	
	public static void main(String [] args) {
		
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Random(0, 30);
			
			boolean flag = false;
			while(true) {
				for(int j = 0; j < i; j++) {
					if(arr[j] == arr[i]) {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					arr[i] = Random(0,30);
					flag = false;
					continue;
				}
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int Random(int n, int m) {
		
		int num = (int)(Math.random()*(m - n) + n + 1);
		return num;
	}
}
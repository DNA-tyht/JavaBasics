package com.tyht.Class;

public class ArrayUtil {
	
	public static void main(String[] args) {
		
	}

	public int max(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public int min(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int avg(int[] arr) {
		 return sum(arr) / arr.length;
	}
	
	public void reverse(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
	}
	
	public int[] copy(int[] arr) {
		int[] copy = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void getIndex(int[] arr, int dest) {
		boolean flag = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == dest) {
				flag = false;
				System.out.print("找到元素在第 " + i + " 位");
				break;
			}
		}
		if(flag) {
			System.out.println("未找到");
		}
	}
}

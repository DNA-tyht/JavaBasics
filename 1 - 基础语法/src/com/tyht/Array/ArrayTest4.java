package com.tyht.Array;

public class ArrayTest4 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int head = 0;
		int end = arr.length - 1;
		int middle, x = 7;
		boolean falg = false;
		while (head <= end) {
			middle = (head + end) / 2;
			if (arr[middle] == x) {
				falg = true;
				break;
			} else if (arr[middle] > x) {
				end = middle - 1;
			} else if (arr[middle] < x) {
				head = middle + 1;
			}
		}

		if (falg) {
			System.out.print(x);
		}
	}
}

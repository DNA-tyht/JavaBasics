package com.tyht.Class;

public class Customer3 {

	public static void main(String[] args) {
		
		int m = 10, n = 8;
		Customer3 a = new Customer3();
		a.method(m, n);
	}
	
	public int method(int m, int n) {
		
		for(int i = 0; i < m; ++i) {
			for(int j = 0; j < n; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int area = m * n;
		System.out.println(area);
		return area;
	}
}

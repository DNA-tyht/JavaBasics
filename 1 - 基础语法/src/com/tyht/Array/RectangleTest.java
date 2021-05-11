package com.tyht.Array;

import java.util.Scanner;

public class RectangleTest {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int maxX = n - 1, maxY = n - 1;
		int minX = 0, minY = 0;
		int[][] arr = new int[n][n];
		
		while(maxX >= minX) {
			for(int x = minX; x <= maxX; x++) {
				arr[minY][x] = ++count;
			}
			minY++;
			for(int y = minY; y <= maxY; y++) {
				arr[y][maxX] = ++count;
			}
			maxX--;
			for(int x = maxX; x >= minX; x--) {
				arr[maxY][x] = ++count;
			}
			maxY--;
			for(int y = maxY; y >= minY; y--) {
				arr[y][minX] = ++count;
			}
			minX++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
				
	}
}

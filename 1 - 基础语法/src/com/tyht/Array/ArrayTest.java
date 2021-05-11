package com.tyht.Array;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		
		System.out.print("请输入学生人数: ");
		int number = scanner.nextInt();
		int [] sorces = new int[number];
		System.out.print("请输入学生成绩: ");
		for(int i = 0; i < number; i++) {
			sorces[i] = scanner.nextInt();
			if(sorces[i] > max)
				max = sorces[i];
		}
		System.out.println("最高分是: " + max);
		
		char level;
		for(int i = 0;i < sorces.length; ++i) {
			if(max - sorces[i] <= 10) {
				level = 'A';
			}
			else if(max - sorces[i] <= 20) {
				level = 'B';
			}
			else if(max - sorces[i] <= 30) {
				level = 'C';
			}
			else{
				level = 'D';
			}
			
			System.out.println("student " + i + " score is " + sorces[i] + " grate is " + level);
		}
	}
}
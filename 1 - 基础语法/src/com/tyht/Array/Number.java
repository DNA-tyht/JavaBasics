package com.tyht.Array;

public class Number {

	public static void main(String [] args) {
		
		int number[] = new int[10];
		int max = 0, min = 100, sum = 0;
		for(int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*(99 - 10 + 10 + 1));
			sum += number[i];
			if(number[i] > max)
				max = number[i];
			if(number[i] < min)
				min = number[i];
		}
		System.out.print(max + " " + min + " " + sum);
	}
}

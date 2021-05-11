package com.tyht.Class;

public class Customer4 {

	public static void main(String[] args) {
		
		//分配空间，只存在首地址
		Student[] s = new Student[20];
		for(int i = 0; i < s.length; i++) {
			//给每个元素赋地址
			s[i] = new Student();
			s[i].number = i + 1;
			s[i].state = s[i].Random(1, 4);
			s[i].score = s[i].Random(0, 100);
		
			if(s[i].state == 3) {
				System.out.println("number: " + s[i].number + "三年级");
			}
		}
		
		for(int i = 0; i < s.length - 1; i++) {
			for(int j = 0; j < s.length - 1 - i; j++) {
				if(s[j].score > s[j+1].score) {
					int tmp = s[j].score;
					s[j].score = s[j+1].score;
					s[j+1].score = tmp;
				}
			}
		}
		
		for(int i = 0; i < s.length; i++) {
			s[i].info();
		}
	}
}

class Student{
	
	int number;
	int state;
	int score;
	
	public void info() {
		
		System.out.println("学号: " + number);
		System.out.println("年纪: " + state);
		System.out.println("成绩: " + score);
	}
	
	public int Random(int n, int m) {
		
		return (int)Math.round((Math.random()*(m - n) + n + 1));
	}
}
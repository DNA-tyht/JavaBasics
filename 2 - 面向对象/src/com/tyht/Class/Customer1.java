package com.tyht.Class;

public class Customer1 {

	public static void main(String[] args) {
		
		Person a = new Person();
		a.name = "Tom";
		a.age = 18;
		a.sex = 1;
	}
}

class Person{
	
	String name;
	int age;
	int sex;
	
	public void study() {
		
		System.out.println("studying");
	}
	
	public void showAge() {
		
		System.out.println("age: " + age);
	}
	
	public int addAge(int n) {
		
		age += n;
		return age;
	}
}
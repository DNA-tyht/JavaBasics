package com.tyht.pack;

public class Boy {
	

	private String name;
	private int age;

	public void setName(String i) {

		name = i;
	}

	public String getName() {

		return name;
	}

	public void setAge(int i) {

		age = i;
	}

	public int getAge() {

		return age;
	}

	public void marry(Girl girl) {

		System.out.println("Marry: " + girl.getName());
	}

	public void shout() {

		if (this.age >= 22) {
			System.out.println("合法登记");
		}
	}
}

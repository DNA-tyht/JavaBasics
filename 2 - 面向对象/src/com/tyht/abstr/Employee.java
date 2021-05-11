package com.tyht.abstr;

public abstract class Employee {

	private String name;
	private int number;
	private MyDate brithday;
	
	public abstract double earnings();
	
	public Employee() {
		super();
	}
	public Employee(String name, int number, MyDate brithday) {
		super();
		this.name = name;
		this.number = number;
		this.brithday = brithday;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", brithday=" + brithday + "]";
	}
}

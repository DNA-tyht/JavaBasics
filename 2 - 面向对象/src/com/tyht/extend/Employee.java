package com.tyht.extend;

public abstract class Employee {

	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	public abstract void work();
}

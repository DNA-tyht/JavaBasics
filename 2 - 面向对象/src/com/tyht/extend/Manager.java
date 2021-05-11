package com.tyht.extend;

public class Manager extends Employee{

	private double bonus;
	
	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	public Manager(String name, int id, double salary) {
		super(name, id, salary);
	}


	@Override
	public void work() {
		System.out.println("管理员工，提高效率");
	}

	
}

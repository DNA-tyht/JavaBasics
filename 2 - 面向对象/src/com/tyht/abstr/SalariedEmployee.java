package com.tyht.abstr;

public class SalariedEmployee extends Employee {

	private double monthlySalary;
	
	

	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + "]";
	}

	@Override
	public double earnings() {
		return monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(double monthlySalary) {
		super();
		this.monthlySalary = monthlySalary;
	}
}

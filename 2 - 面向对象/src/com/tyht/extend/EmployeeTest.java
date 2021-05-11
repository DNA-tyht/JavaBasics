package com.tyht.extend;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager manager = new Manager("kuke", 1001, 2000, 20000);
		manager.work();
		
		CommonEmloyee common = new CommonEmloyee();
		common.work();
	}
}

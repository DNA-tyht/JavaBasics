package com.tyht.pack;

public class Bank {

	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank() {
		customers = new Customer[10];
		numberOfCustomer = 0;
	}
	
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		customers[numberOfCustomer] = cust;
		++numberOfCustomer;
	}
	
	public Customer getCustomers(int index) {
		return customers[index];
	}

	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}
}

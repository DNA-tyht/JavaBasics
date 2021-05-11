package com.tyht.extend;

public class Account {

	private int id;
	private double balance;
	private double annuallnterestRate;

	public Account() {
		
	}
	
	public Account(int id, double balance, double annuallnterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}

	public double getMonthlyInterest() {
		return annuallnterestRate/12;
	}
	
	public void whitdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return;
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
}

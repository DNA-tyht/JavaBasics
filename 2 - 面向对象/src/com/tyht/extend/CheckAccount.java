package com.tyht.extend;

public class CheckAccount extends Account {

	private double overdraft;

	public CheckAccount(int id, double balance, double annualinterestRate, double overdraft) {
		super(id, balance, annualinterestRate);
		this.overdraft = overdraft;
	}

	@Override
	public void whitdraw(double amount) {
		if (this.getBalance() >= amount) {
			// this.setBalance(getBalance() - amount);
			super.whitdraw(amount);
		} else if (overdraft >= amount - getBalance()) {
			overdraft -= amount - getBalance();
			super.whitdraw(getBalance());
		} else {
			System.out.println("超过透支限额");
		}
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
}
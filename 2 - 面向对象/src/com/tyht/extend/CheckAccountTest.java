package com.tyht.extend;

public class CheckAccountTest {

	public static void main(String[] args) {
		
		CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
		acct.whitdraw(5000);
		System.out.println("账户余额" + acct.getBalance());
		System.out.println("透支限额" + acct.getOverdraft());
		acct.whitdraw(18000);
		System.out.println("账户余额" + acct.getBalance());
		System.out.println("透支限额" + acct.getOverdraft());
		acct.whitdraw(3000);
		System.out.println("账户余额" + acct.getBalance());
		System.out.println("透支限额" + acct.getOverdraft());
	}
}

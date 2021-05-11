package com.tyht.Class;

//匿名对象
public class VirtualCustomer {
	
	public static void main(String[] args) {
		
		//不是一个对象
		new VirtualCustomer().Email();
		new VirtualCustomer().Game();
		
		//应用
		Phone x = new Phone();
		x.show(new VirtualCustomer());
	}
	
	public void Email() {
		
		System.out.println("发消息");
	}
	
	public void Game() {
		
		System.out.println("玩游戏");
	}
}

class Phone{
	
	public void show(VirtualCustomer x) {
		System.out.println("手机");
	}
}
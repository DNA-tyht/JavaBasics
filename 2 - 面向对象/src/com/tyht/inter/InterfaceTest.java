package com.tyht.inter;

public class InterfaceTest {

}

interface Flyable{
	//全局常量
	public static final int MAX_SPEED = 7900;
	//省略的写法，实际上还是全局常量
	int MIN_SPEED = 1;
	
	//抽象方法
	public abstract void fly();
	//省略的写法，实际上还是抽象方法
	void stop();
}

class Plane implements Flyable{
	public void fly() {
	}

	public void stop() {
	}
	
}
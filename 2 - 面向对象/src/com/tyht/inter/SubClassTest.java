package com.tyht.inter;

public class SubClassTest {
	
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//接口中定义的静态方法只能通过接口调用
		CompareA.method1();
		//通过实现类的对象，调用接口中的默认方法
		s.method2();
		s.method3();
	}
}

class SubClass implements CompareA{
	
}

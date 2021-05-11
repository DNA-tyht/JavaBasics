package com.tyht.inter;

public interface CompareA {

	//静态方法
	public static void method1() {
		System.out.println("Compare北京");
	}
	//默认方法
	public default void method2() {
		System.out.println("Compare上海");
	}
	//省略的默认方法
	default void method3() {
		System.out.println("Compare武汉");
	}
}

package com.tyht.Class;

//可变形参的方法
//jdk5 新增的内容
//可变个数的形参的格式 ...变量
//传入参数的个数可以改变
//必须声明在末尾

public class MethodArgs {

	public static void main(String[] args) {
		
		MethodArgs test = new MethodArgs();
		test.show(1);
		//test.show("111", "222");
		test.show(new String[] {"aa", "bb", "cc"});
	}
	
	public void show(int i) {
		
		
	}
	
	public void show(String[] strs) {
	}
	
//	public void show(String ... str) {
//	}
}

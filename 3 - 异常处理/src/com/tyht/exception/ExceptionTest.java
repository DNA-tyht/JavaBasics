package com.tyht.exception;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public void test1() {
		int[] arr = new int[3];
		System.out.println(arr[3]);
	}
	@Test
	public void test2() {
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
	}
	@Test
	public void test3() {
		Object obj = new Integer(0);
		String str = (String)obj;
	}
	@Test
	public void test4() {
		String str = "abc";
		try {
			int num = Integer.parseInt(str);
		} catch(NumberFormatException e) {
			System.out.println("数值转换异常");
		}
	}
}

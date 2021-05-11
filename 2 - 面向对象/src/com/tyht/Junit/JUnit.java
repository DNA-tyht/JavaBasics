package com.tyht.Junit;

import org.junit.Test;

/**
*@Description单元测试
*@author 脱氧核糖 Email:tyhtwork@163.com
*@version
*@date 2021年3月18日下午10:17:09
*
 */
public class JUnit {
	
	@Test
	public void testEquals() {
		String s1 = "1";
		String s2 = "2";
		System.out.println(s1.equals(s2));
	}
	
	@Test
	public void testInteger() {
		int num = 10;
		Integer in1 = new Integer(num);
		System.out.println(in1.toString());
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
	}
	
}
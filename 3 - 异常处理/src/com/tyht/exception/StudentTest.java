package com.tyht.exception;

public class StudentTest {

	
}

class Student{
	
	private int id;
	public void regist(int id) throws Exception {
		if(id > 0)
			this.id = id;
		else
			throw new Exception("输入的数据非法");
	}
}
package com.tyht.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThorwsTest {
	
	public static void main(String[] args) {
		try {
			method2();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static  void method2() throws FileNotFoundException, IOException {
		method1();
	}
	
	public static void method1() throws FileNotFoundException, IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
	}
}

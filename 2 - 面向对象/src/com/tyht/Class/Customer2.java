package com.tyht.Class;

public class Customer2 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.radius = 4;
		System.out.print(c.findArea());
	}
}

class Circle{
	
	double radius;
	
	public double findArea() {
		
		double area = 3.14 * radius * radius;
		return area;
	}
}

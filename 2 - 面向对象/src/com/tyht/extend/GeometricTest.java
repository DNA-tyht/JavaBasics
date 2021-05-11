package com.tyht.extend;

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		Circle c1 = new Circle(2, "red", 1.0);
		test.dispalyGeometricObject(c1);
		Circle c2 = new Circle(3, "bule", 1.0);
		test.dispalyGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		if(isEquals)
			System.out.println("面积相等");
	}
	
	public void dispalyGeometricObject(GeometricObject o) {
		System.out.println("面积为: " + o.findArea());
	}
	
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
}

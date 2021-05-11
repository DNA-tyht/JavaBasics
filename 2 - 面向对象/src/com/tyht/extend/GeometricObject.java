package com.tyht.extend;

/**
*@Description 几何图形
*@author 脱氧核糖 Email:tyhtwork@163.com
*@version
*@date 2021年3月18日下午7:13:43
*
 */
public class GeometricObject {

	protected String color;
	protected double weight;
	
	public GeometricObject() {
		super();
	}

	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public double findArea() {
		return 0.0;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

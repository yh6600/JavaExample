package com.oop.classes1;

public class Circle {
	
	//24.12.12	269page
	
	private int radius;
	private Circle_Point center;
	
	public Circle(Circle_Point p, int r) {
		center = p;
		radius = r;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
	
}

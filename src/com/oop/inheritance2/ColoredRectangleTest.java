package com.oop.inheritance2;

class Shape1{
	private int x;
	private int y;
	
	public Shape1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Shape1()");
	}
}

class Rectangle1 extends Shape1{
	private int width;
	private int height;
	
	public Rectangle1(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		System.out.println("Rectangle1()");
	}
	public double calcArea() {
		return width * height;
	}
}
class ColoredRectangle extends Rectangle1{
	String color;

	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);
		this.color = color;
		System.out.println("ColoredRectangle()");
	}
	
}

public class ColoredRectangleTest {
	public static void main(String[] args) {
		//24.12.30 331page
		ColoredRectangle c = new ColoredRectangle(10,10,20,20,"red");
		System.out.println(c.calcArea());
		
		
	}
}

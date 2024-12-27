package com.oop.inheritance;

public class Rectangle extends Shape{

	//24.12.27 311page
	
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public double area() {
		
		return (double) width * height;
	}
	
	public void draw() {
		
		System.out.println("("+this.getX() +","+this.getY()+") 위치에 " +" 가로 "+width + " 세로 "+height);
	}
}

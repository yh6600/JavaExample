package com.oop.method;

public class Child  extends Parent{
	//24.12.30 321page
	
	public void print() {
		super.print();
		System.out.println("자식 클래스");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}

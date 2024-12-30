package com.oop.inheritance2;

class Shape{
	public Shape() {
		// TODO Auto-generated constructor stub
		System.out.println("Shape 생성자");
	}
	// 매개변수가 있는 생성자 
	public Shape(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Shape 매개변수가 있는 생성자");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		// super(); 키워드를 사용하지않아도 자바에서는 자식 클래스의 객체가 생성될 때 자동적으로 부모 클래스의 기본생성자가 호출된다. -> 묵시적인 호출 
		// -> 명시를 하지않아도 묵시적으로 호출하기 때문에 별 이유가 없다면 super 키워드로 명시할 필요가 없음.
		
		super(); //명시적인 호출
		System.out.println("Rectangle 생성자 ");
	}
	
	public Rectangle(String msg) {
		//매개변수가 있는 부모 클래스의 생성자 호출시 매개변수 반환타입을 맞추어 줘야함.
		super(1); //명시적인 호출
		System.out.println("Rectangle 생성자 2");
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		//24.12.30 326page
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle("test");
	}

}

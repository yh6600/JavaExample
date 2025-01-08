package com.oop.abstractExample;

//추상 클래스 Shape 선언.       , 추상 클래스로는 객체를 생성할 수 없음.
abstract class Shape{
	private int x,y;
	//추상 클래스여도 추상 메소드가 아닌 보통의 메소드를 가질 수 있음.
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//추상 메소드 선언,		추상 메소드를 하나라도 가지면 추상 클래스가 된다. 
	//추상 메소드를 가지고 있는데도 abstract를 class 앞에 붙이지 않으면 컴파일 오류가 발생함.
	public abstract void draw();
}

class Retangle extends Shape {
	private int width,height;
	//	자식 클래스 Retangle 에서 부모 클래스의 추상 메소드 draw()가 실제 메소드로 구현한다.
	//	자식 클래스에서 추상 메소드를 구현하지 않으면 컴파일 오류가 발생한다.
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}

}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("원 그리기 메소드 ");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Retangle r = new Retangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
	}
}

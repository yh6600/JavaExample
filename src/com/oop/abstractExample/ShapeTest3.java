package com.oop.abstractExample;

class Shape3{
	protected int x,y;

	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rentangle3 extends Shape3{
	private int width,height;
	
	public void draw() {
		System.out.println("Rectangle3 Draw");
	}
}

class Triangle3 extends Shape3{
	private int base,heigth;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle3 Draw");
	}
}

class Cricle3 extends Shape3{
	private int radius;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle3 Draw");
	}
}

class Cylinder extends Shape3 {
	private int radius,height;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Cylinder Draw");
	}
}
public class ShapeTest3 {
	private static Shape3 arrayOfShapes[];
	
	// printLocation * (Shape3 s)  상향 형변환을 이용하는 메소드의 매개 변수 * 
	public static void printLocation(Shape3 s) { 
		System.out.println("x = "+s.x+" y ="+s.y);
	}
	
	public static void main(String[] args) {
		// 25.1.8 341 ~ 2page

		init();
		drawAll();
		
		
		Rentangle3 s1 = new Rentangle3();
		Triangle3 s2 = new Triangle3(); 
		Cricle3 s3 = new Cricle3();
		
		printLocation(s1);
		printLocation(s2);
		printLocation(s3);
		/*
		 *  다형성은 객체들이 같은 메시지 또는 동작을 받더라도 객체의 상황 , 타입에 따라 서로 다른 동작을 하는 것을 의미한다.
		 	동적 메소드 호출을 했을때 참조변수의 타입은 부모 클래스 이지만 실제 가리키는 객체의 타입은 자식 클래스 이기때문에
		 	자식 클래스 메소드가 호출된 예제이다.
		  
		 	ex) s2의 타입은 Shape3 이지만 s2가 실제로 가리키고 있는 객체의 타입이 Rectangle3 이기 때문에
		 	Rectangle3 의 draw()가 호출된다.
		 */
		
//		Shape3 s1,s2,s3,s4;
//		
//		s1 = new Shape3();
//		s2 = new Rentangle3();
//		s3 = new Triangle3();
//		s4 = new Cricle3();
		
//		s1.draw();
//		s2.draw();
//		s3.draw();
//		s4.draw();
		
	}

	public static void init() {
		arrayOfShapes = new Shape3[4];
		arrayOfShapes[0] = new Rentangle3();
		arrayOfShapes[1] = new Triangle3();
		arrayOfShapes[2] = new Cricle3();
		arrayOfShapes[3] = new Cylinder();
	}
	public static void drawAll() {
		for(int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
	
}

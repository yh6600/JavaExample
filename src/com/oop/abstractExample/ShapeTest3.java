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
	
	// printLocation * (Shape3 s)  ���� ����ȯ�� �̿��ϴ� �޼ҵ��� �Ű� ���� * 
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
		 *  �������� ��ü���� ���� �޽��� �Ǵ� ������ �޴��� ��ü�� ��Ȳ , Ÿ�Կ� ���� ���� �ٸ� ������ �ϴ� ���� �ǹ��Ѵ�.
		 	���� �޼ҵ� ȣ���� ������ ���������� Ÿ���� �θ� Ŭ���� ������ ���� ����Ű�� ��ü�� Ÿ���� �ڽ� Ŭ���� �̱⶧����
		 	�ڽ� Ŭ���� �޼ҵ尡 ȣ��� �����̴�.
		  
		 	ex) s2�� Ÿ���� Shape3 ������ s2�� ������ ����Ű�� �ִ� ��ü�� Ÿ���� Rectangle3 �̱� ������
		 	Rectangle3 �� draw()�� ȣ��ȴ�.
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

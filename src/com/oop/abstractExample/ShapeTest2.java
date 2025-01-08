package com.oop.abstractExample;

class Shape1 {
	protected int x,y;
}

class Rantangle1 extends Shape1{
	private int width,height;

}

class Triangle1 extends Shape1{
	private int base,height;
}

class Circle1 extends Shape1{
	private int radius;
}

public class ShapeTest2 {
	public static void main(String[] args) {
		// 2025.1.8	338page
		
		Shape1 s1,s2;
		
		s1 = new Shape1();
		s2 = new Rantangle1();
		
		//위의 코드 중 s2 = new Rantangle1(); 문장을 생각하여 보자.
		
		/* 
		   Rectangle1 타입의 객체가 생성되어서 Shape1 타입의 참조 변수에 대입되는 문장은 오류처럼 보인다.
		   그러나 자식 클래스 객체는 부모 클래스 객체처럼 취급될 수 있기 때문에 위의 문장은 적법하다.
		   즉 부모 클래스 참조 변수로 자식 클래스 객체를 참조할 수 있다.
		   이것을 상향 형변환이라고 한다.
		   위의 문장은 다형성의 핵심이 되므로 잘 이해하여야 한다고 한다.		 
		     */
	}

}

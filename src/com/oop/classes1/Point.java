package com.oop.classes1;

public class Point {

	//24.12.11	260page this 로 현재 객체 나타내기
	
	private int x = 0;
	private int y = 0;
	
	//method 내부에 필드 직접 접근 
	/*
	  public Point(int a,int b) { x = a; y = b; }
	 */
	//this()로 생성자 호출 
	public Point() {
		this(1, 10);
	}
	
	//this 사용시 매개변수 이름이 인스턴스 변수와 이름이 같아도 된다.
	//this 사용시 매개 변수와 필드의 이름을 동일하게 사용하여 생산성 향상에 많은 도움을 준다고 한다.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

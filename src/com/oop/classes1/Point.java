package com.oop.classes1;

public class Point {

	//24.12.11	260page this �� ���� ��ü ��Ÿ����
	
	private int x = 0;
	private int y = 0;
	
	//method ���ο� �ʵ� ���� ���� 
	/*
	  public Point(int a,int b) { x = a; y = b; }
	 */
	//this()�� ������ ȣ�� 
	public Point() {
		this(1, 10);
	}
	
	//this ���� �Ű����� �̸��� �ν��Ͻ� ������ �̸��� ���Ƶ� �ȴ�.
	//this ���� �Ű� ������ �ʵ��� �̸��� �����ϰ� ����Ͽ� ���꼺 ��� ���� ������ �شٰ� �Ѵ�.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

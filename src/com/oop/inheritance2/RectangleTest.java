package com.oop.inheritance2;

class Shape{
	public Shape() {
		// TODO Auto-generated constructor stub
		System.out.println("Shape ������");
	}
	// �Ű������� �ִ� ������ 
	public Shape(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Shape �Ű������� �ִ� ������");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		// super(); Ű���带 ��������ʾƵ� �ڹٿ����� �ڽ� Ŭ������ ��ü�� ������ �� �ڵ������� �θ� Ŭ������ �⺻�����ڰ� ȣ��ȴ�. -> �������� ȣ�� 
		// -> ��ø� �����ʾƵ� ���������� ȣ���ϱ� ������ �� ������ ���ٸ� super Ű����� ����� �ʿ䰡 ����.
		
		super(); //������� ȣ��
		System.out.println("Rectangle ������ ");
	}
	
	public Rectangle(String msg) {
		//�Ű������� �ִ� �θ� Ŭ������ ������ ȣ��� �Ű����� ��ȯŸ���� ���߾� �����.
		super(1); //������� ȣ��
		System.out.println("Rectangle ������ 2");
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		//24.12.30 326page
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle("test");
	}

}

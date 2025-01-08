package com.oop.abstractExample;

//�߻� Ŭ���� Shape ����.       , �߻� Ŭ�����δ� ��ü�� ������ �� ����.
abstract class Shape{
	private int x,y;
	//�߻� Ŭ�������� �߻� �޼ҵ尡 �ƴ� ������ �޼ҵ带 ���� �� ����.
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//�߻� �޼ҵ� ����,		�߻� �޼ҵ带 �ϳ��� ������ �߻� Ŭ������ �ȴ�. 
	//�߻� �޼ҵ带 ������ �ִµ��� abstract�� class �տ� ������ ������ ������ ������ �߻���.
	public abstract void draw();
}

class Retangle extends Shape {
	private int width,height;
	//	�ڽ� Ŭ���� Retangle ���� �θ� Ŭ������ �߻� �޼ҵ� draw()�� ���� �޼ҵ�� �����Ѵ�.
	//	�ڽ� Ŭ�������� �߻� �޼ҵ带 �������� ������ ������ ������ �߻��Ѵ�.
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}

}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ� ");
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

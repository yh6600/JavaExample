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
		
		//���� �ڵ� �� s2 = new Rantangle1(); ������ �����Ͽ� ����.
		
		/* 
		   Rectangle1 Ÿ���� ��ü�� �����Ǿ Shape1 Ÿ���� ���� ������ ���ԵǴ� ������ ����ó�� ���δ�.
		   �׷��� �ڽ� Ŭ���� ��ü�� �θ� Ŭ���� ��üó�� ��޵� �� �ֱ� ������ ���� ������ �����ϴ�.
		   �� �θ� Ŭ���� ���� ������ �ڽ� Ŭ���� ��ü�� ������ �� �ִ�.
		   �̰��� ���� ����ȯ�̶�� �Ѵ�.
		   ���� ������ �������� �ٽ��� �ǹǷ� �� �����Ͽ��� �Ѵٰ� �Ѵ�.		 
		     */
	}

}

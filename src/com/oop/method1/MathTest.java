package com.oop.method1;

public class MathTest {
	public static void main(String[] args) {
		
		int sum;
		
		MathExample obj = new MathExample();
		
		sum =obj.add(15, 3); //15 , 3 �� �μ��μ� add()�� ���� �ȴ�.
		System.out.println("15 �� 3 �� ���� :"+sum);
		
		sum = obj.add(10, 30);
		System.out.println("10 ���ϱ� 30 �� :"+sum);
	}
}

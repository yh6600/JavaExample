package com.oop.string;

public class ExampleString2 {

	public static void main(String[] args) {
		// 2024.12.06	233page
		
		//��ġ���� ���ڿ��� ��ȯ�ϴ� ���
		
		int x = 20;
		System.out.println("������� :"+x);

		String answer = "The answer is " + 100;
		System.out.println("answer : "+answer);
		
		String test = "test "+ x;
		System.out.println("test: "+test);
		
		//������ ���ڿ� ������ ������ ���� 
		System.out.println("100"+20);
		System.out.println(100+20);
		
		//���ڿ��� ��ġ������ ��ȯ�ϴ� ���
		int i = Integer.parseInt("131");
		System.out.println("���ڿ��� ������ ��ȯ: "+i);
		double d = Double.parseDouble("3.1415");
		System.out.println("���ڿ��� �Ǽ��� ��ȯ: "+d);
		
		/*
		 * �ڹٿ����� ������ �Ǽ��� ���� �����ڷ����� �����ϸ� ������ ��ü�� �Ǿ��ִ�. 
		 * � ��쿡�� �����ڷ����� ��ü�� �����ϰ� ���� ��찡 ���� ���̴�. 
		 * �̷� ��쿡 ����ϴ� Ŭ������ ���� Ŭ����(wrapper class)�̴�. 
		 * �ڹ��� �� ���� �ڷ����� ���Ͽ� �ش�Ǵ� ���� Ŭ������ �����Ѵ�.
		 */
		
	}

}

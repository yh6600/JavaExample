package com.oop.string1;

public class ExampleString {

	public static void main(String[] args) {
		// 2024.12.06	233page
		
		String proverb = "A barking dog"; 
		String s1,s2,s3,s4,s5;
		
		System.out.println("���ڿ��� ���� : "+proverb.length());

		s1 = proverb.concat(" never Bites!"); 
		System.out.println("���ڿ� ���� : "+s1);
		
		s2 = proverb.replace('b', 'B'); //proverb ���ڿ��� b�� �빮�� B�� ��ȯ
		System.out.println("���� ��ȯ : "+s2);
		
		s3 = proverb.substring(1,5);//(1,5)���� 1�� begin 5�� end ���ڿ��� beginIndex���� �����ؼ� endIndex ���������� �κ� ���ڿ��� ��ȯ��.
		System.out.println("�κ� ���ڿ� ���� : "+s3); //beginIndex�� �̻� endIndex�� �̸� �̶� ���� �ϸ� �� �� ����.
		
		s4 = proverb.toUpperCase();
		System.out.println("�빮�� ��ȯ : "+s4);
		
		s5 = proverb.toLowerCase();
		System.out.println("�ҹ��� ��ȯ : "+s5);
		
		
		int size = "Hello World".length();
		int testSize = s5.length();
		System.out.println(size);
		System.out.println("test :"+testSize);
		
		String subject = "Money";
		String other = " has no value if it is not used";
		String sentence = subject + other;
		System.out.println("���ڿ� ������ ����: "+sentence);
		
		
	}

}

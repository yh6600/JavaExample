package com.basic.example;

public class ExampleRealNumber {

	public static void main(String[] args) {
		// 24 11 19
		
		/* 
		Syntax
		%n : �ٹٲ�
		%s : String �������� ���
		%d : integer �������� ���
		%f : float �������� ���
		%t : date, time �������� ���
		%o : 8���� integer �������� ���
		%x : 16���� integer �������� ���
		%b : boolean �������� ���
		%e : ���� �������� ���
		��ó -https://codechacha.com/ko/java-printf-format/#google_vignette
		*/
		//�Ҽ��� n�ڸ� ��ȯ ������
		double value = 1.0/3.0;
		System.out.printf("%1.4f",value);
		System.out.print("\n"+value);
		System.out.printf("\n"+ "%6.2f",value);

		String test ="test";
		System.out.printf("\n"+ "%s",'a'+test);
		
		System.out.println("\n"+ test+"--");
	}

}

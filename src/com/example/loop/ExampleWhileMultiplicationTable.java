package com.example.loop;

import java.util.Scanner;

public class ExampleWhileMultiplicationTable {

	public static void main(String[] args) {
		// 24.11.21 while ������
		
		int i = 1;
		
		System.out.print("�� �Է� : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // n�� ex) 1��,,,9�� 
		
		//while ���ǽ� ���� ������ 
		while (i<=9) {
			System.out.println(n+" * "+ i +" = " + n * i);
			i++;
		}
		
		
		
	}

}

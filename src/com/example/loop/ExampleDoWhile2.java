package com.example.loop;

import java.util.Scanner;

public class ExampleDoWhile2 {

	public static void main(String[] args) {
		// 24.11.21   ,  128page
		
		Scanner scan = new Scanner(System.in);
		int month;
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� : ");
			month = scan.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("����ڰ� �Է��ѿ��� : "+month);
		
	}
}

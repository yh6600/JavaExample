package com.example.controlStatement;

import java.util.Scanner;

public class ExampleEvenOdd {

	public static void main(String[] args) {
		//24.11.19  104page ~ 
		//¦�� Ȧ�� �������� 
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.print("���� �Է� :");
		number = scan.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("�Էµ� ������ ¦�� �Դϴ�.");
		}else {
			System.out.println("�Էµ� ������ Ȧ�� �Դϴ�.");
		}
			System.out.println("����");
	}

}

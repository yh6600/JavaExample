package com.example.controlStatement;

import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
		// 114 page  , switch 24 11 20 git ���ε� �Ұ� 
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("case �� ������ �� 2 ���� ������ default ���");
			break;
		}
	}

}

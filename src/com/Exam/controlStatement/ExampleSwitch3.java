package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleSwitch3 {

	public static void main(String[] args) {
		// 114 page  , 24 11 20 
		// break �� �ǵ������� �����Ͽ� �Ѱ��� case���� ���� ��°��� ��������.
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 0:
			System.out.println("0");
			break;
		case 1:
		case 2:
			System.out.println("1,2");
			break;
		default:
			System.out.println("case �� ������ �� 2 ���� ������ default ���");
			break;
		}
	}

}

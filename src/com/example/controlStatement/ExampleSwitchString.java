package com.example.controlStatement;

import java.util.Scanner;

public class ExampleSwitchString {

	public static void main(String[] args) {
		// 118 page  , 24 11 20 
		//switch ���ڿ��� �Է� �޾� ������ ���ϴ� ������ ����ϴ� ���� 
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");

		String month = scan.next();
		
		int monthNumber;
		switch(month) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
			break;
		}
		System.out.println(" month : "+monthNumber);
	}

}

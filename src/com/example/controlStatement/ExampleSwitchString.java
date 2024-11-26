package com.example.controlStatement;

import java.util.Scanner;

public class ExampleSwitchString {

	public static void main(String[] args) {
		// 118 page  , 24 11 20 
		//switch 문자열을 입력 받아 정수를 원하는 정수를 출력하는 예제 
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력 : ");

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

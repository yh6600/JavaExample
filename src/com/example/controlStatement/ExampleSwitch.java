package com.example.controlStatement;

import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
		// 114 page  , switch 24 11 20 git 업로드 할것 
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
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
			System.out.println("case 로 정해진 수 2 보다 높을시 default 출력");
			break;
		}
	}

}

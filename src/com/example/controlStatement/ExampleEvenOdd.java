package com.example.controlStatement;

import java.util.Scanner;

public class ExampleEvenOdd {

	public static void main(String[] args) {
		//24.11.19  104page ~ 
		//짝수 홀수 구별예제 
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.print("정수 입력 :");
		number = scan.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("입력된 정수는 짝수 입니다.");
		}else {
			System.out.println("입력된 정수는 홀수 입니다.");
		}
			System.out.println("종료");
	}

}

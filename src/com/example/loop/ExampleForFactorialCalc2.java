package com.example.loop;

import java.util.Scanner;

public class ExampleForFactorialCalc2 {

	public static void main(String[] args) {
		// 24.11.22  134page
		
	
		long fact =1;
		int n;
		
		System.out.print("정수 입력 :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
			if (fact < 0) {
				System.out.println(i + "오버플로우 발생");
				break;
			}
			System.out.printf("%d!은 %d 입니다.\n ",n,fact);
		}
	}

}

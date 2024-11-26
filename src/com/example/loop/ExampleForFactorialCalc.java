package com.example.loop;

import java.util.Scanner;

public class ExampleForFactorialCalc {

	public static void main(String[] args) {
		// 24.11.22  134page 
	
		long fact =1;
		int n;
		
		System.out.print("정수 입력 :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.printf("%d!은 %d 입니다. \n",n,fact);
		}
			
	}

}

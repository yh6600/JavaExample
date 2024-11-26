package com.example.loop;

import java.util.Scanner;

public class ExampleDivisor {

	public static void main(String[] args) {
		// 24.11.22 136page 
		//약수 계산 예제 
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int n = scan.nextInt();
		
		System.out.println("n의 약수는 : "+n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i );
			}
		}
		
	}

}

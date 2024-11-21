package com.basic.example;

import java.util.Scanner;

public class ExampleScanner1 {

	public static void main(String[] args) {
		
		// 2024 11 19 
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		System.out.print("x 입력 : ");
		x = scan.nextInt();
		System.out.print("y 입력 : ");
		y = scan.nextInt();
		
		sum = x+y;
		System.out.println(sum);
		
	}

}

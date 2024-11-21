package com.example.loop;

import java.util.Scanner;

public class ExampleWhileMultiplicationTable {

	public static void main(String[] args) {
		// 24.11.21 while 구구단
		
		int i = 1;
		
		System.out.print("단 입력 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // n단 ex) 1단,,,9단 
		
		//while 조건식 단의 곱셈수 
		while (i<=9) {
			System.out.println(n+" * "+ i +" = " + n * i);
			i++;
		}
		
		
		
	}

}

package com.example.loop;

import java.util.Scanner;

public class ExampleForFactorialCalc {

	public static void main(String[] args) {
		// 24.11.22  134page 
	
		long fact =1;
		int n;
		
		System.out.print("���� �Է� :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.printf("%d!�� %d �Դϴ�. \n",n,fact);
		}
			
	}

}

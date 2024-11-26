package com.example.loop;

import java.util.Random;
import java.util.Scanner;

public class ExampleRandomNumber {

	public static void main(String[] args) {
		// 24.11.22 138page 
		
		Random generator =new Random();
		
		System.out.print("난수의 개수 : ");
		
		Scanner scan = new Scanner(System.in);
		int count =scan.nextInt();
		int sum = 0;
		
		for(int i=0; i < count; i++) {
			int number = generator.nextInt(100);
			System.out.println("number : "+number);
			sum += number ;
		}
		System.out.println("난수 " +count+" 개의 합은"+ sum);
		
	}

}

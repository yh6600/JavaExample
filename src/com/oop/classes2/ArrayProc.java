package com.oop.classes2;

import java.util.Scanner;

public class ArrayProc {
		
	//24.12.12	277page
	
	public void getValue(int []array) {
		Scanner scan = new Scanner(System.in);
		//성적 array 배열의 길이(수) 만큼 입력 
		for (int i = 0; i < array.length; i++) {
			System.out.println("성적 입력: ");
			array[i] = scan.nextInt();
		}
	}
	
	public double getAverage(int[] array) {
		double total =0;
		
		for (int i = 0; i < array.length; i++) {
			 total += array[i];
		}
		return total / array.length;
	}
}

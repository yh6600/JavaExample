package com.oop.classes2;

import java.util.Scanner;

public class ArrayProc {
		
	//24.12.12	277page
	
	public void getValue(int []array) {
		Scanner scan = new Scanner(System.in);
		//���� array �迭�� ����(��) ��ŭ �Է� 
		for (int i = 0; i < array.length; i++) {
			System.out.println("���� �Է�: ");
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

package com.example.array;

import java.util.Scanner;

public class ExampleAverageCalc {

	public static void main(String[] args) {
		// 155 page 24.11.26
		
		final int STUDENTS= 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int scores[] = new int[STUDENTS];
		for (int i = 0; i < scores.length; i++) {
			System.out.print("���� �Է� : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i =0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("��� ������ : "+total/STUDENTS);
	}

}

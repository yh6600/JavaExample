package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleNestingIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int grade;
		System.out.print("���� �Է� : ");
		grade = scan.nextInt();
		// grade >=70 && grade < 90 �� �����ǹ̷� ��밡���� 
		if (grade >= 70)
			if (grade >= 90) 
				System.out.println("A");
		else 
			System.out.println("B");
		
		/* else if ��� ���� �� 
		if (grade >= 90) {
			System.out.println("A");
		}else if (grade >= 70 && grade < 90 ) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		*/
	}

}

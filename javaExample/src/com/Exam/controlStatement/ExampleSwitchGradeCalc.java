package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleSwitchGradeCalc {

	public static void main(String[] args) {
		// 114 page  , 24 11 20 
		//if-else �� ���ϸ� ���� �غ���
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		char grade;
		int score,number;
		score = scan.nextInt();
		number = score / 10;
		
		switch(number) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("���� : "+grade);
	}

}

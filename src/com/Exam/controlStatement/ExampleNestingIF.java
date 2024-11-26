package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleNestingIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int grade;
		System.out.print("점수 입력 : ");
		grade = scan.nextInt();
		// grade >=70 && grade < 90 와 같은의미로 사용가능함 
		if (grade >= 70)
			if (grade >= 90) 
				System.out.println("A");
		else 
			System.out.println("B");
		
		/* else if 사용 했을 시 
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

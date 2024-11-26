package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleGradeCalc {

	public static void main(String[] args) {
		// 110 page 24-11-19 학점계산기 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점 입력 : ");
		int grade = scan.nextInt();
		/*
		if (grade >=90) {
			System.out.println("A");
		}else if (grade >=80) {
			System.out.println("B");
		}else if (grade >=70) {
			System.out.println("C");
		}else if (grade >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}*/
		
		if (grade >=95) {
			System.out.println("A+");
		}else if (grade >=90) {
			System.out.println("A");
		}else if (grade >=85) {
			System.out.println("B+");
		}else if (grade >=80) {
			System.out.println("B");
		}else if (grade >=75) {
			System.out.println("C+");
		}else if (grade >=70) {
			System.out.println("C");
		}else if (grade >=65) {
			System.out.println("D+");
		}else if (grade >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}

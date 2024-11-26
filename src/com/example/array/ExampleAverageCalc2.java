package com.example.array;

import java.util.Scanner;

public class ExampleAverageCalc2 {

	public static void main(String[] args) {
		// 155 page 24.11.26
		
		//학생의 수를 사용자로부터 받고 학생의 수만큼 크기를 가지는 배열을 생성해 성적평균을 계산 
		//자바에서 배열의 크기는 변수로 지정할 수 있다는 점이 자바의 큰장점임.
		int students = 0; 
		int total = 0;
		int avg = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수 입력 : ");
		students = scan.nextInt();
		int scores[] = new int[students];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적 입력 : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i =0; i < scores.length; i++) {
			total += scores[i];
		}
			avg = total / students;
		System.out.println("평균 성적은 : "+avg);
		
	}

}

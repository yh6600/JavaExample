package com.example.breackANDcontinue;

import java.util.Scanner;

public class ExampleBreak {

	public static void main(String[] args) {
		// 24.11.26
		//사용자가 입력한 점수의 평균을 낼때 사용자 가 음수입력시 break로 루프 종료 예제
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		while (true) {
			System.out.print("점수 입력 : ");
			int grade =scan.nextInt();
			if (grade < 0) {
				break;
			}
			
			total += grade;
			count++;
		}
		System.out.println("평균은 : "+ total/count);
	}

}

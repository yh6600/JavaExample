package com.example.examloop;

import java.util.Scanner;

public class ExamGuessingGames2 {

	public static void main(String[] args) {
		// 24.11.26 144page
		// ������ ������ ����� ����ó�� ��ȭ��Ŵ.
		Scanner scan = new Scanner(System.in);
		int answer =(int)(Math.random() * 100);
		int count =0;
		int guess;

		//System.out.println("answer :" + answer);
		do {
			System.out.print("���� ���� : ");
			 guess= scan.nextInt();
			if (guess < answer) {
				System.out.println("���ڰ� �����ϴ�.");
			}else if (guess > answer) {
				System.out.println("���ڰ� �����ϴ�.");
			}
			count++;
		} while (guess != answer);{
			System.out.println("����"+"\n�õ�Ƚ�� : "+count);
		}
	}

}

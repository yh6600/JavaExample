package com.exam.loop;

import java.util.Scanner;

public class ExamGuessingGames {

	public static void main(String[] args) {
		// 24.11.26 144page
		
		Scanner scan = new Scanner(System.in);
		int answer =7;
		int count =0;
		int guess;

		do {
			System.out.print("���� ���� : ");
			 guess= scan.nextInt();
			if (guess < answer) {
				System.out.println("���ڰ� �����ϴ�.");
			}if (guess > answer) {
				System.out.println("���ڰ� �����ϴ�.");
			}
			count++;
		} while (guess != answer);
			System.out.println("����" +"\n �õ�Ƚ��"+count);
			
	}

}

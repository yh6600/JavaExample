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
			System.out.print("정답 추측 : ");
			 guess= scan.nextInt();
			if (guess < answer) {
				System.out.println("숫자가 낮습니다.");
			}if (guess > answer) {
				System.out.println("숫자가 높습니다.");
			}
			count++;
		} while (guess != answer);
			System.out.println("정답" +"\n 시도횟수"+count);
			
	}

}

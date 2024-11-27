package com.example.examloop;

import java.util.Scanner;

public class ExamGuessingGames2 {

	public static void main(String[] args) {
		// 24.11.26 144page
		// 정답을 난수로 만들어 게임처럼 변화시킴.
		Scanner scan = new Scanner(System.in);
		int answer =(int)(Math.random() * 100);
		int count =0;
		int guess;

		//System.out.println("answer :" + answer);
		do {
			System.out.print("정답 추측 : ");
			 guess= scan.nextInt();
			if (guess < answer) {
				System.out.println("숫자가 낮습니다.");
			}else if (guess > answer) {
				System.out.println("숫자가 높습니다.");
			}
			count++;
		} while (guess != answer);{
			System.out.println("정답"+"\n시도횟수 : "+count);
		}
	}

}

package com.example.breackANDcontinue;

import java.util.Scanner;

public class ExampleBreak2 {

	public static void main(String[] args) {
		// 24.11.26
		// 중첩된 루프 전체를 종료하고자 할때 레이블이 있는 break 를 사용 해야하는 예제
		Scanner scan = new Scanner(System.in);
		outer_loop: //레이블 정의 
			while (true) {
				while (true) {
					int grade = scan.nextInt();
					if (grade < 0) {
						break outer_loop;
					}
				}
			}
		// break 가 옮겨질 위치 
	}

}

package com.example.loop;

import java.util.Scanner;

public class ExampleWhileCalc {

	public static void main(String[] args) {
		// 24-11-21 
		//예제이후 도전문제 - 사용자로 부터 정수를 입력받아 1부터 그 정수의 합을 계산하는 코드
	
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= x) {
			sum += i;
			i++;
		}
		System.out.println("입력받은 정수와의 합계 :" + sum);
		}
	}
		
	



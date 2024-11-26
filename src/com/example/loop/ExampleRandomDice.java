package com.example.loop;

import java.util.Random;
import java.util.Scanner;

public class ExampleRandomDice {

	public static void main(String[] args) {
		// 24.11.22 
		// 138page 난수 예제 응용 
 
		Random generator =new Random(); // 랜덤객체생성 
		
		System.out.print("주사위를 던질 인원수 입력 : ");
		// 11.22 ~ 이후 해볼것 : player 승리자 출력하기 		
		Scanner scan = new Scanner(System.in);
		int dice =scan.nextInt(); //주사위 
		int number = 0; //주사위를 던져 나온 값 
		int maxNum = 0;
		for(int i=0; i < dice; i++) {
			number = generator.nextInt(6) +1;
			System.out.println("player"+(i+1)+"주사위 수는 " + number);
			if (number > maxNum) {
				maxNum = number;
			}
		}
		System.out.println("가장높은 수는 : "+maxNum);
		
	}

}

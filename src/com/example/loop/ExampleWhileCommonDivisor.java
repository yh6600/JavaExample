package com.example.loop;

import java.util.Scanner;

public class ExampleWhileCommonDivisor {

	public static void main(String[] args) {
		// 24.11.21 ,  130page

		int x,y,r;
		System.out.print("두개의 정수 입력 : ");
		Scanner scan = new Scanner(System.in);
	
		x = scan.nextInt();
		y = scan.nextInt();
		//x,y 값입력 -> while 조건식 y가 0이 아닐때 문장실행 -> y가 0이 되면 루프 종료 
		// x와y를 나눠 남은값은 r변수에 할당 
		//나누어남은값의 y변수 값이 x에 할당  
		//x와y를 나눈 r값을 y 에 할당 ?  
		while (y !=0 ) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 : "+ x );
	}

}

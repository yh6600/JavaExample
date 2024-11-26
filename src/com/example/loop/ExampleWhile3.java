package com.example.loop;

import java.util.Scanner;

public class ExampleWhile3 {

	public static void main(String[] args) {
		// 24-11-21 125page 
		// 예제 잘못 읽고 만든 프로그램 , 사용자가 20을 입력했을때만 입력수를 0부터 19까지 출력함 
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(i < 20 ) {
			if (x == 20) {
				System.out.println("i : "+i);
				i++;
			}else {
				System.out.println("X");
				break;
				}
			}
		
		}
	}
		
	



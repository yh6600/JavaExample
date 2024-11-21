package com.example.loop;

import java.util.Scanner;

public class ExampleWhile4 {

	public static void main(String[] args) {
		// 24-11-21 125page 
		//0에서 부터 시작해서 사용자가 입력한 값까지 출력하는 프로그램  ex) 20 입력시 0 ~ 19 까지 출력 (증감 위치중요)
		int i = 0;
		System.out.print("입력한 값 : ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(i < x ) {
				System.out.println("입력 : "+i);
				i++;
			}
		
		}
	}
		
	



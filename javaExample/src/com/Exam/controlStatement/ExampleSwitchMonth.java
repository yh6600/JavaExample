package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleSwitchMonth {

	public static void main(String[] args) {
		// 118 page  , 24 11 20 
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력 : ");

		int monthNumber = scan.nextInt();
		// 31 = 1,3,5,7,8,10,12 : 30 = 4,6,9,11 : 29 = 2
		int days = 0;
		switch(monthNumber) {
		case 2:
			 days = 29;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1 : 
		case 3 :
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 :
		case 12 :
			days = 31;
			break;
		default:
			System.out.println("X");
			break;
		}
		System.out.println("월의 날수 : "+days);
	}
	//교재와 내생각대로한 차이점
	
	/*  
	 교재 : 31일 까지 있는 월 수가 가장 많으니 default 문에 days변수 31을 지정하였음.
	 내생각 : 번거로워도 많은 수를 입력하게 되는 것이 좋은 것인지 잘모르겠으나 12월을 넘는 월이 없기에 일일이 지정하였음.
	   */
}

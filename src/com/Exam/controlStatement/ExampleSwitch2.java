package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleSwitch2 {

	public static void main(String[] args) {
		// 114 page , 24 11 20
		// break 를 의도적으로 생략하여 한가지 case에서 같은 출력값을 낼수있음.
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = scan.nextInt();

		
		 switch(num) {
		 case 0: System.out.println("0"); 
		 break; 
		 
		 case 1:
			 	 System.out.println("1"); 
		
		 case 2: System.out.println("2"); 
		 break; 
		 
		 default:
		 System.out.println("case 로 정해진 수 2 보다 높을시 default 출력"); break; }
		 

	}

}

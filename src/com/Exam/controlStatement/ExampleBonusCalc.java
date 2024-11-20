package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleBonusCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetSales = 1000; //실적 목표가 상수로 정의 
		int mySales; //나의 실적 
		int bonus; 
		String result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나의 실적 입력 : ");
		mySales = scan.nextInt();
		
		//나의 실적과 실적목표를 if-else 와 연산자로 비교하여 실적달성 여부를 제어함 
		
		//나의실적을 Scanner 에 입력시 실적목표와 값을비교하여 목표실적보다 값이 높을경우 내실적과 목표실적을 뺀후 나눈 10이 bouns가 됌.
		//목표실적보다 낮을경우 보너스는 0 이게됨 if-else이기 떄문에.
		if (mySales >= targetSales) {
			result = "실적 달성";
			bonus = (mySales - targetSales) /10;
		}else {
			result = "실적 달성 X";
			bonus = 0;
		}
		System.out.println("성과 : "+result+"\n보너스:"+bonus);
	}

}

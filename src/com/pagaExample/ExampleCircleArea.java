package com.pagaExample;

import java.util.Scanner;

public class ExampleCircleArea {

	public static void main(String[] args) {
		// 97page
		
		double radius; //원의 반지름
		double area; // 원의 면적 
		
		System.out.print("반지름을 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		
		radius = scan.nextDouble();
		
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}

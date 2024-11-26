package com.basic.example;

import java.util.Scanner;

public class ExampleRectangle {

	public static void main(String[] args) {
		// 99page
		
		double width;
		double height;
		double area;
		double perimeter;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		width = scan.nextDouble();
		System.out.print("세로 입력 : ");
		height = scan.nextDouble();
		
		area = width * height;
		perimeter = 2.0 *(width+height);
		
		System.out.println("넓이 : "+area);
		System.out.println("둘레 : "+perimeter+"\n");
		
		System.out.println("넓이 : "+area +"\n둘레 :"+perimeter);

	}

}

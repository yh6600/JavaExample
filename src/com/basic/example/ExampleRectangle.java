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
		
		System.out.print("���� �Է� : ");
		width = scan.nextDouble();
		System.out.print("���� �Է� : ");
		height = scan.nextDouble();
		
		area = width * height;
		perimeter = 2.0 *(width+height);
		
		System.out.println("���� : "+area);
		System.out.println("�ѷ� : "+perimeter+"\n");
		
		System.out.println("���� : "+area +"\n�ѷ� :"+perimeter);

	}

}

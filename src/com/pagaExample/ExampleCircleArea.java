package com.pagaExample;

import java.util.Scanner;

public class ExampleCircleArea {

	public static void main(String[] args) {
		// 97page
		
		double radius; //���� ������
		double area; // ���� ���� 
		
		System.out.print("�������� �Է����ּ��� : ");
		Scanner scan = new Scanner(System.in);
		
		radius = scan.nextDouble();
		
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}

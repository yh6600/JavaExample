package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleNumberGreaterThan {

	public static void main(String[] args) {
		// 106 page 
			int x,y,z,max = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("����1�� : ");
			x = scan.nextInt();
			
			System.out.print("����2�� : ");
			y = scan.nextInt();
			
			System.out.print("���� 3�� : ");
			z = scan.nextInt();
			
			if (x > y) {
				max = x;
			}else if (y > z){
				max = y;
			}else {
				max = z;
			}
			//else if (z > x){ max = z } && else {max = z} �� ��� 
			System.out.println("ū���� : "+max);
			
	}

}

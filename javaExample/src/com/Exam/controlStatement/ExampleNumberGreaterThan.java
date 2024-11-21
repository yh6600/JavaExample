package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleNumberGreaterThan {

	public static void main(String[] args) {
		// 106 page 
			int x,y,z,max = 0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("정수1번 : ");
			x = scan.nextInt();
			
			System.out.print("정수2번 : ");
			y = scan.nextInt();
			
			System.out.print("정수 3번 : ");
			z = scan.nextInt();
			
			if (x > y) {
				max = x;
			}else if (y > z){
				max = y;
			}else {
				max = z;
			}
			//else if (z > x){ max = z } && else {max = z} 중 사용 
			System.out.println("큰수는 : "+max);
			
	}

}

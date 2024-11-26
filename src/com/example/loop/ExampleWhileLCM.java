package com.example.loop;

import java.util.Scanner;

public class ExampleWhileLCM {

	public static void main(String[] args) {
		// 24.11.22 ,  least common multiple

		int x,y,r;
		System.out.print("두개의 정수 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();

		int originalX = x;
        int originalY = y;
        System.out.println("x : "+originalX);
        System.out.println("y : "+originalY);

		while (y !=0 ) {
			r = x % y;
			x = y;
			y = r;
		}
		int lcm = (originalX * originalY) / x;
		System.out.println("while X :"+ x);
		System.out.println("최소 공배수는 : "+ lcm );
	}

}

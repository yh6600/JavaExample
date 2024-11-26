package com.basic.example;

import java.util.Scanner;

public class ExampleScanner2 {

	public static void main(String[] args) {
		
		// 2024 11 19 
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름 입력 : ");
		name = scan.nextLine();
		
		System.out.print("age : ");
		age = scan.nextInt();
		
		System.out.println("name :"+name+" age:"+age);
		
	}

}

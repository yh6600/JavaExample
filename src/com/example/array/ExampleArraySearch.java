package com.example.array;

import java.util.Scanner;

public class ExampleArraySearch {

	public static void main(String[] args) {
		// 161page 24.11.27
		
		int list[]= {1,2,3,5,6,7,8,22,4,55};
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("탐색할 값 입력 : ");
		int search= scan.nextInt();
		for (int i = 0; i < list.length; i++) {
			if (search == list[i]) {
				System.out.println(search+"값은 "+"배열의 "+i+" 위치에 있습니다.");
				a = i;
			}
		}
		System.out.println("a :"+ a);
		if (a < list.length && a >=0) {
			System.out.println(search+"값은 :"+a+"위치에 있습니다.");
		}
	}

}

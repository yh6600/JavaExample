package com.example.array;

import java.util.Scanner;

public class ExampleArraySearch {

	public static void main(String[] args) {
		// 161page 24.11.27
		
		int list[]= {1,2,3,5,6,7,8,22,4,55};
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("Ž���� �� �Է� : ");
		int search= scan.nextInt();
		for (int i = 0; i < list.length; i++) {
			if (search == list[i]) {
				System.out.println(search+"���� "+"�迭�� "+i+" ��ġ�� �ֽ��ϴ�.");
				a = i;
			}
		}
		System.out.println("a :"+ a);
		if (a < list.length && a >=0) {
			System.out.println(search+"���� :"+a+"��ġ�� �ֽ��ϴ�.");
		}
	}

}

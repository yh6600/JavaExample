package com.example.loop;

import java.util.Scanner;

public class ExampleDivisor {

	public static void main(String[] args) {
		// 24.11.22 136page 
		//��� ��� ���� 
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int n = scan.nextInt();
		
		System.out.println("n�� ����� : "+n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i );
			}
		}
		
	}

}

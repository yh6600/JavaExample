package com.example.breackANDcontinue;

import java.util.Scanner;

public class ExampleBreak {

	public static void main(String[] args) {
		// 24.11.26
		//����ڰ� �Է��� ������ ����� ���� ����� �� �����Է½� break�� ���� ���� ����
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		while (true) {
			System.out.print("���� �Է� : ");
			int grade =scan.nextInt();
			if (grade < 0) {
				break;
			}
			
			total += grade;
			count++;
		}
		System.out.println("����� : "+ total/count);
	}

}

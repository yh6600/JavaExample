package com.example.array;

import java.util.Scanner;

public class ExampleAverageCalc2 {

	public static void main(String[] args) {
		// 155 page 24.11.26
		
		//�л��� ���� ����ڷκ��� �ް� �л��� ����ŭ ũ�⸦ ������ �迭�� ������ ��������� ��� 
		//�ڹٿ��� �迭�� ũ��� ������ ������ �� �ִٴ� ���� �ڹ��� ū������.
		int students = 0; 
		int total = 0;
		int avg = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л��� �Է� : ");
		students = scan.nextInt();
		int scores[] = new int[students];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("���� �Է� : ");
			scores[i] = scan.nextInt();
		}
		
		for(int i =0; i < scores.length; i++) {
			total += scores[i];
		}
			avg = total / students;
		System.out.println("��� ������ : "+avg);
		
	}

}

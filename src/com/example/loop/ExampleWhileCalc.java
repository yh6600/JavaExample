package com.example.loop;

import java.util.Scanner;

public class ExampleWhileCalc {

	public static void main(String[] args) {
		// 24-11-21 
		//�������� �������� - ����ڷ� ���� ������ �Է¹޾� 1���� �� ������ ���� ����ϴ� �ڵ�
	
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= x) {
			sum += i;
			i++;
		}
		System.out.println("�Է¹��� �������� �հ� :" + sum);
		}
	}
		
	



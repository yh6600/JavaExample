package com.example.loop;

import java.util.Random;
import java.util.Scanner;

public class ExampleRandomDice {

	public static void main(String[] args) {
		// 24.11.22 
		// 138page ���� ���� ���� 
 
		Random generator =new Random(); // ������ü���� 
		
		System.out.print("�ֻ����� ���� �ο��� �Է� : ");
		// 11.22 ~ ���� �غ��� : player �¸��� ����ϱ� 		
		Scanner scan = new Scanner(System.in);
		int dice =scan.nextInt(); //�ֻ��� 
		int number = 0; //�ֻ����� ���� ���� �� 
		int maxNum = 0;
		for(int i=0; i < dice; i++) {
			number = generator.nextInt(6) +1;
			System.out.println("player"+(i+1)+"�ֻ��� ���� " + number);
			if (number > maxNum) {
				maxNum = number;
			}
		}
		System.out.println("������� ���� : "+maxNum);
		
	}

}

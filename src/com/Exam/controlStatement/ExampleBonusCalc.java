package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleBonusCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetSales = 1000; //���� ��ǥ�� ����� ���� 
		int mySales; //���� ���� 
		int bonus; 
		String result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		mySales = scan.nextInt();
		
		//���� ������ ������ǥ�� if-else �� �����ڷ� ���Ͽ� �����޼� ���θ� ������ 
		
		//���ǽ����� Scanner �� �Է½� ������ǥ�� �������Ͽ� ��ǥ�������� ���� ������� �������� ��ǥ������ ���� ���� 10�� bouns�� ��.
		//��ǥ�������� ������� ���ʽ��� 0 �̰Ե� if-else�̱� ������.
		if (mySales >= targetSales) {
			result = "���� �޼�";
			bonus = (mySales - targetSales) /10;
		}else {
			result = "���� �޼� X";
			bonus = 0;
		}
		System.out.println("���� : "+result+"\n���ʽ�:"+bonus);
	}

}

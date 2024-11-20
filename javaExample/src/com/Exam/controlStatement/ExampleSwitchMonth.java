package com.Exam.controlStatement;

import java.util.Scanner;

public class ExampleSwitchMonth {

	public static void main(String[] args) {
		// 118 page  , 24 11 20 
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");

		int monthNumber = scan.nextInt();
		// 31 = 1,3,5,7,8,10,12 : 30 = 4,6,9,11 : 29 = 2
		int days = 0;
		switch(monthNumber) {
		case 2:
			 days = 29;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1 : 
		case 3 :
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 :
		case 12 :
			days = 31;
			break;
		default:
			System.out.println("X");
			break;
		}
		System.out.println("���� ���� : "+days);
	}
	//����� ����������� ������
	
	/*  
	 ���� : 31�� ���� �ִ� �� ���� ���� ������ default ���� days���� 31�� �����Ͽ���.
	 ������ : ���ŷο��� ���� ���� �Է��ϰ� �Ǵ� ���� ���� ������ �߸𸣰����� 12���� �Ѵ� ���� ���⿡ ������ �����Ͽ���.
	   */
}

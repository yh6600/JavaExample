package com.example.loop;

import java.util.Scanner;

public class ExampleWhileCommonDivisor {

	public static void main(String[] args) {
		// 24.11.21 ,  130page

		int x,y,r;
		System.out.print("�ΰ��� ���� �Է� : ");
		Scanner scan = new Scanner(System.in);
	
		x = scan.nextInt();
		y = scan.nextInt();
		//x,y ���Է� -> while ���ǽ� y�� 0�� �ƴҶ� ������� -> y�� 0�� �Ǹ� ���� ���� 
		// x��y�� ���� �������� r������ �Ҵ� 
		//����������� y���� ���� x�� �Ҵ�  
		//x��y�� ���� r���� y �� �Ҵ� ?  
		while (y !=0 ) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� ������� : "+ x );
	}

}

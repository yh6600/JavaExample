package com.example.loop;

import java.util.Scanner;

public class ExampleWhile4 {

	public static void main(String[] args) {
		// 24-11-21 125page 
		//0���� ���� �����ؼ� ����ڰ� �Է��� ������ ����ϴ� ���α׷�  ex) 20 �Է½� 0 ~ 19 ���� ��� (���� ��ġ�߿�)
		int i = 0;
		System.out.print("�Է��� �� : ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(i < x ) {
				System.out.println("�Է� : "+i);
				i++;
			}
		
		}
	}
		
	



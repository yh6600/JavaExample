package com.example.loop;

import java.util.Scanner;

public class ExampleWhile3 {

	public static void main(String[] args) {
		// 24-11-21 125page 
		// ���� �߸� �а� ���� ���α׷� , ����ڰ� 20�� �Է��������� �Է¼��� 0���� 19���� ����� 
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(i < 20 ) {
			if (x == 20) {
				System.out.println("i : "+i);
				i++;
			}else {
				System.out.println("X");
				break;
				}
			}
		
		}
	}
		
	



package com.oop.string1;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// 2024.12.06	236page
		
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���>");
			str = scan.next();
			if (str.equals("quit") == true) {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}
			if (str.matches("^www\\.(.+)")) {
				System.out.println("www �� �����մϴ�");
			}else {
				System.out.println("www �� �������� �ʽ��ϴ�");
			}
		}
	}

}

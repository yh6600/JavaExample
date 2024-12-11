package com.oop.string1;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// 2024.12.06	236page
		
		
		Scanner scan = new Scanner(System.in);
		String str = "";
		
		while(true) {
			System.out.print("문자열을 입력하세요>");
			str = scan.next();
			if (str.equals("quit") == true) {
				System.out.println("종료 되었습니다.");
				break;
			}
			if (str.matches("^www\\.(.+)")) {
				System.out.println("www 로 시작합니다");
			}else {
				System.out.println("www 로 시작하지 않습니다");
			}
		}
	}

}

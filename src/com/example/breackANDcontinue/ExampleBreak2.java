package com.example.breackANDcontinue;

import java.util.Scanner;

public class ExampleBreak2 {

	public static void main(String[] args) {
		// 24.11.26
		// ��ø�� ���� ��ü�� �����ϰ��� �Ҷ� ���̺��� �ִ� break �� ��� �ؾ��ϴ� ����
		Scanner scan = new Scanner(System.in);
		outer_loop: //���̺� ���� 
			while (true) {
				while (true) {
					int grade = scan.nextInt();
					if (grade < 0) {
						break outer_loop;
					}
				}
			}
		// break �� �Ű��� ��ġ 
	}

}

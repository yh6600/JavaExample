package com.example.nestdloop;


public class ExampleNestedLoop7 {

	public static void main(String[] args) {
		// 24.11.26 ���̾Ƹ�� ���� 
			int n = 5;
		    // ���� �ﰢ�� ���
	        for (int i = 1; i <= n; i++) {
	            // ���� ��� (��� ����)
	            for (int j = 1; j <= (n - i); j++) {
	                System.out.print(" ");
	            }
	            // �� ���
	            for (int j = 1; j <= (2 * i - 1); j++) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        for (int i = 4; i >= 1; --i) {
	            // ���� ��� (��� ����)
	            for (int j = 1; j <= (n - i); j++) {
	                System.out.print(" ");
	            }
	            // �� ���
	            for (int j = 1; j <= (2 * i - 1); j++) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }

	
		

	}

}

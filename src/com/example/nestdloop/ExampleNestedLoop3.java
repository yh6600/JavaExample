package com.example.nestdloop;

public class ExampleNestedLoop3 {

	public static void main(String[] args) {
		// 24.11.25
		  for (int j = 1; j <= 9; j++) {  // ������ ����� ����ϴ� �κ�
	            for (int i = 1; i <= 9; i++) {  // �� �ܸ��� 1���� 9���� ���ϱ�
	                System.out.printf("%d x %d = %2d   ", i, j, i * j);  // ��� ���� ���߱�
	            }
	            System.out.println();  // �� �� ������ �ٹٲ�
	        }

	}

}

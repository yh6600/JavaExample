package com.example.loop;


public class ExampleWhileCalSum {

	public static void main(String[] args) {
		// 24-11-21 
		
		int i = 1 ; // ���� i �� ���� 1���� �ʱ�ȭ 
		int sum = 0 ; // ���� sum ���� 0���� �ʱ�ȭ 
		//while ���ǽĿ� �ݺ�Ƚ���� 1���� 10 ���� �ݺ���Ű�� �񱳿����� 
		while (i <= 10) {
			//sum = sum + i ; // �ʱ�ȭ�� sum ������ ������ i�� ���ϰ�,������ sum ���� �����Ǿ� �Ҵ�
			sum += i;
			i++; // ���� i ���� ������� ���������� ���.
			//������� ���� ���� �����ڸ� �������� sum ������ ���� +����� �����̵Ǿ� sum������ �Ҵ� �Ǵ°� �� Ȯ�� �Ҽ� �־���. 
		}
		System.out.println("sum : "+sum);
		
		}
	}
		
	



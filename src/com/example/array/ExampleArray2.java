package com.example.array;

public class ExampleArray2 {

	public static void main(String[] args) {
		// 157page 24.11.27
		
		//�迭�� �ʱ�ȭ
		//�迭�� ����� ���ÿ� �ʱ�ȭ �ϴ� ��� , �̶����� new������ �� ������� �ʾƵ� �迭�� ������.
		//�̷��� ����� �迭�� ����Ǵ� ���� �̸� �˰��ִ� ��쿡 ��� �ȴ�.
		int scores[] = {10,20,30,40,50};
		for(int i =0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//�迭 ���� ������ ������ �Ʒ��� ���� �ʱ�ȭ �ϴ°��� ������.
		/*
		  int x []; x = {1,2,3,4,5};
		 */
		
		//���� �迭 
		int a [];
		a = new int[] {1,2,3,4,5};
		System.out.println("����迭 a index 1 :"+a[0]);
		
	}

}

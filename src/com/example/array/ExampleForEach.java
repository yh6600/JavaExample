package com.example.array;

public class ExampleForEach {

	public static void main(String[] args) {
		// 167page 24.11.27
		
		//for-each loop
		
		int numbers[]= {10,20,30};
		//for-each ���� value �� �ݺ��� ����Ǹ鼭 numbers�� �迭�� ù ��° ���Һ��� ������ �迭 ���� ���� ���ʴ�� ���Ե�.
		//�迭���� ��Ҹ� �ϳ��� ������ ó���ϴ� ����� for-each�� ����ϴ°��� �����.
		for (int value : numbers) {
			System.out.println(value+" ");
		}
		//������ ����� for �� , �����ִ� for-each �� �Ʒ��� for ���� ������ .
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}

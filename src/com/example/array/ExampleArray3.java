package com.example.array;


public class ExampleArray3 {

	public static void main(String[] args) {
		// 173page  24.11.28
		
		int s [][]= new int[3][5];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(s[i][j]);
			}
		}
		//2���� �迭�� �ʱ�ȭ 
		//���� ���� ��Ҹ� �߰�ȣ�� ����.
		int testArray [][]= {
				{10,20,30}, //ù��° ��[row] 
				{40,50,60},
				{70,80,90}
		};
		//2���� �迭������ length �ʵ�
		int array [][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.println(r+ "�� " + c +" �� " + array[r][c]);
			}
		}
		
		//������ �迭 
		double sales [][][] = new double [3][2][12];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int j2 = 0; j2 < 12; j2++) {
					System.out.println(i+" "+j+" "+j2+" "+sales[i][j][j2]);
				}
			}
		}
		
		
	}

}

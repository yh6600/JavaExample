package com.example.array;


public class Minesweeper {

	public static void main(String[] args) {
		// 178page 24.11.28

		//���ڰ� ������ ĭ ���� ���� ������ ��Ÿ���� ���� �����ϱ�, ���ڿ� ���ڸ� ���ÿ� ����غ���.
		
		//����ڰ� ����ã�� ������ �Ҽ� �ֵ��� �����غ��� , ����ڿ��Ը� �������� �迭 ���� 
		//-> �� 100���� �迭�� ���ڷ� ǥ���� ������ �Է°��� ������ ���ڸ� # �ƴҰ�� . ����ϰԲ� ����� ����ɵ�.
		boolean board [][] = new boolean [10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) 
				if (Math.random() < 0.3) {
					board[i][j] = true;
				}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) 
				if (board[i][j]) 
					System.out.print("#  ");
				else 
					System.out.print(".  ");
				System.out.println();
		}
		
		
	}

}

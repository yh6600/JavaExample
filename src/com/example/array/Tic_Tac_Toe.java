package com.example.array;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// 175page 24.11.28 
		
		//�������� ��Ÿ���� 2���� �迭 ���� 
		char[][]board = new char [3][3];
		int x,y;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
		
		do {
			for (int i = 0; i < 3; i++) {
				System.out.println("  "+ board[i][0] + "|  "+board[i][1]+"|  "+board[i][2]);
				if (i != 2) 
					System.out.println("---|---|---");
			}
				System.out.print("���� ���� ��ǥ�� �Է� �Ͻÿ�.");
				x = scan.nextInt();
				y = scan.nextInt();
			
				if (board[x][y] != ' ') {
					System.out.println("�߸��� ��ġ�Դϴ�.");
					continue;
				}else 
					board[x][y] = 'X';
				//��ǻ�Ͱ� �η��� ���� ����ڰ� �� �Է½� index �� ���ļ� ���� �߻��� ,,
				//��ǻ�Ͱ� �δ� ���� �������� �ΰ��ϰ� ���� ���� ��ġ�ԵǸ� �޼�������� �ٸ� �󰪿� char �� O �� �ֱ� 
				int i =0, j=0;
				for (i = 0;  i < 3; i++) {
					for (j = 0; j < 3; j++) 
						if (board[i][j] == ' ' ) 
							break;
						if (board[i][j] == ' ' ) 
							break;
					}
						if (i < 3 && j < 3) 
							board[i][j] = 'O';
					
		} while (true);
		
		
		
	}

}

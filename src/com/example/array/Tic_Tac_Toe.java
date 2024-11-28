package com.example.array;

import java.util.Scanner;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// 175page 24.11.28 
		
		//게임판을 나타내는 2차원 배열 생성 
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
				System.out.print("다음 수의 좌표를 입력 하시오.");
				x = scan.nextInt();
				y = scan.nextInt();
			
				if (board[x][y] != ' ') {
					System.out.println("잘못된 위치입니다.");
					continue;
				}else 
					board[x][y] = 'X';
				//컴퓨터가 두려는 수에 사용자가 값 입력시 index 가 겹쳐서 에러 발생함 ,,
				//컴퓨터가 두는 수를 무작위로 두게하고 만약 값이 겹치게되면 메세지출력후 다른 빈값에 char 의 O 값 넣기 
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

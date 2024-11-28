package com.example.array;


public class Minesweeper {

	public static void main(String[] args) {
		// 178page 24.11.28

		//지뢰가 숨겨진 칸 옆에 지뢰 개수를 나타내는 숫자 저장하기, 지뢰와 숫자를 동시에 출력해볼것.
		
		//사용자가 지뢰찾기 게임을 할수 있도록 변경해볼것 , 사용자에게만 보여지는 배열 생성 
		//-> 총 100개의 배열을 숫자로 표현후 정수로 입력값을 받을시 지뢰면 # 아닐경우 . 출력하게끔 만들어 보면될듯.
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

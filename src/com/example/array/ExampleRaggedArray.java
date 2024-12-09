package com.example.array;


public class ExampleRaggedArray {

	public static void main(String[] args) {
		// 24.12.02 185page
		
		final int MAX_ROWS = 5;
		int ragged [][] = new int [MAX_ROWS+1][];
		for (int r = 0; r < ragged.length; r++) 
			ragged[r] = new int [r+1];
		
		for (int r = 0; r < ragged.length; r++) 
			for (int c = 0; c < ragged[r].length; c++) {
				ragged[r][c] = c;
			}
		

		for (int r = 0; r < ragged.length; r++) {
			for (int c = 0; c < ragged[r].length; c++) 
				System.out.print(ragged[r][c]+ " ");
				System.out.println();
		}
		
	}

}

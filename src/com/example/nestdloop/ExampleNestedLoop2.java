package com.example.nestdloop;

public class ExampleNestedLoop2 {

	public static void main(String[] args) {
		// 24.11.25
		
		for (int y = 1; y <= 9; y++) { //column 세로 열
			for(int x= 2 ; x <= 9; x++) { //row 가로 행 
				System.out.print(x+"*"+y+"="+x*y+" ");
			}
			System.out.println();
		}

	}

}

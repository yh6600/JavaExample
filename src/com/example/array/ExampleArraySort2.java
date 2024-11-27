package com.example.array;

import java.util.Arrays;

public class ExampleArraySort2 {

	public static void main(String[] args) {
		// 172page 24.11.27
		
		final int SIZE =10;
		int numbers[] = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			int r= (int) (Math.random()*100);
			numbers[i] = r;
		}
		System.out.println("최초의 리스트 :");
		
		for (int r : numbers) {
			System.out.print(r+" ");
			Arrays.sort(numbers);
		}
		System.out.println("\n정렬된 리스트 : ");
		for (int r : numbers) {
			System.out.print(r + " ");
		}
	
	}

}

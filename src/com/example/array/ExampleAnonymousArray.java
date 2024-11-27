package com.example.array;

public class ExampleAnonymousArray {

	public static void main(String[] args) {
		// 166page 24.11.27
		
		System.out.println("무명배열 합 :"+sum(new int[] {1,2,3,4}));
	}

	public static int sum(int[] number) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < number.length; i++) {
			total = total + number[i];
		}
		return total;
	}

}

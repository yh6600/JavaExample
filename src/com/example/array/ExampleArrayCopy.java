package com.example.array;

public class ExampleArrayCopy {

	public static void main(String[] args) {
		// 168page 24.11.27
		//배열복사 
		
		int list[] = {1,2,3,4,5};
		int numbers[] = list;
	
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("list : "+list[i]);
			System.out.println("numbers :"+numbers[i]);
		}
		System.out.println("test 1 "+numbers[2]);
		list[2]=30;
		System.out.println("test 2 "+numbers[2]);
	}

}

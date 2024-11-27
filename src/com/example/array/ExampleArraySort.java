package com.example.array;

import java.util.Arrays;

public class ExampleArraySort {

	public static void main(String[] args) {
		// 171page 24.11.27
		
		//배열 정렬 
		int a [] =new int[10];
		a[0] = 32;
		a[1] = 21;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

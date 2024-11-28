package com.example.arraylist;

import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		//184page 24.11.28
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		System.out.println(" "+list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list : "+list.get(i));
		}
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(33);
		System.out.println("data : "+data);
		int firstNumber = data.get(0);
		System.out.println("firstNumber : "+firstNumber);
	}

}

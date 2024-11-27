package com.example.array;

public class ExampleStringArray {

	public static void main(String[] args) {
		// 157page 24.11.27
		
		//문자열 배열 
		
		String toppings []= {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};
		
		for(int i =0; i <toppings.length;i++) {
			System.out.println("toppings : "+ toppings[i]);
		}
		
		//실수 출력 예제 
		double data [] = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
		for (int i = 0; i < data.length; i++) {
			System.out.println( "실수 출력 : "+data[i]);
		}
		
	}

}

package com.basic.example;

public class ExampleOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산예제 
		int x = 1;
		int y = 1;
		
		int nextx = ++x; //x의 값이 사용되기전 증가
		int nexty = y++; //y의 값이 사용된이후 증가 
		System.out.println("nextx : "+nextx);
		System.out.println("nexty : "+nexty);
	}

}

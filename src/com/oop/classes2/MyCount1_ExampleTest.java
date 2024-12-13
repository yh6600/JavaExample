package com.oop.classes2;

public class MyCount1_ExampleTest {

	public static void main(String[] args) {
		//24.12.12	273page
		//기초 변수가 전달되는 경우
		
		MyCount1_Example obj = new MyCount1_Example();
		//inc() 메소드 안에서 value 의 값을 변경하여도 호출에 사용된 변수 x에는 영향을 주지 않음.
		int x = 10;
		obj.inc(x);
		System.out.println("x = "+x);
		
	}
}

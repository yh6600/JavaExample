package com.oop.string;

public class ExampleString2 {

	public static void main(String[] args) {
		// 2024.12.06	233page
		
		//수치값을 문자열로 변환하는 방법
		
		int x = 20;
		System.out.println("결과값은 :"+x);

		String answer = "The answer is " + 100;
		System.out.println("answer : "+answer);
		
		String test = "test "+ x;
		System.out.println("test: "+test);
		
		//정수와 문자열 연산자 결합의 차이 
		System.out.println("100"+20);
		System.out.println(100+20);
		
		//문자열을 수치값으로 변환하는 방법
		int i = Integer.parseInt("131");
		System.out.println("문자열을 정수로 변환: "+i);
		double d = Double.parseDouble("3.1415");
		System.out.println("문자열을 실수로 변환: "+d);
		
		/*
		 * 자바에서는 정수나 실수와 같은 기초자료형을 제외하면 모든것이 객체로 되어있다. 
		 * 어떤 경우에는 기초자료형도 객체로 포장하고 싶은 경우가 있을 것이다. 
		 * 이런 경우에 사용하는 클래스가 랩퍼 클래스(wrapper class)이다. 
		 * 자바의 각 기초 자료형에 대하여 해당되는 랩퍼 클래스가 존재한다.
		 */
		
	}

}

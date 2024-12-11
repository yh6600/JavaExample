package com.oop.method1;

public class MathTest {
	public static void main(String[] args) {
		
		int sum;
		
		MathExample obj = new MathExample();
		
		sum =obj.add(15, 3); //15 , 3 은 인수로서 add()로 전달 된다.
		System.out.println("15 와 3 의 합은 :"+sum);
		
		sum = obj.add(10, 30);
		System.out.println("10 더하기 30 은 :"+sum);
	}
}

package com.example.loop;

public class ExampleDoWhile {

	public static void main(String[] args) {
		// 24.11.21
		
		/* 
		아래의 예에서 i의 값은 10으로 명백히 3보다 작지않다. 하지만 먼저 문장을 실행한 후에 조건식을
		검사하기 때문에 한번은 실행된다.   
		do-while문은 데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를 입력을 받아야 하는 경우에 많이 사용된다.
		   
		   */
		int i = 10;
		do {
			System.out.println("i의 값 : " + i);
		} while (i<3);
	}

}

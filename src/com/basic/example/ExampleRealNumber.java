package com.basic.example;

public class ExampleRealNumber {

	public static void main(String[] args) {
		// 24 11 19
		
		/* 
		Syntax
		%n : 줄바꿈
		%s : String 형식으로 출력
		%d : integer 형식으로 출력
		%f : float 형식으로 출력
		%t : date, time 형식으로 출력
		%o : 8진수 integer 형식으로 출력
		%x : 16진수 integer 형식으로 출력
		%b : boolean 형식으로 출력
		%e : 지수 형식으로 출력
		출처 -https://codechacha.com/ko/java-printf-format/#google_vignette
		*/
		//소수점 n자리 반환 포매팅
		double value = 1.0/3.0;
		System.out.printf("%1.4f",value);
		System.out.print("\n"+value);
		System.out.printf("\n"+ "%6.2f",value);

		String test ="test";
		System.out.printf("\n"+ "%s",'a'+test);
		
		System.out.println("\n"+ test+"--");
	}

}

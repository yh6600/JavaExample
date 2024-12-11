package com.oop.string1;

public class ExampleString {

	public static void main(String[] args) {
		// 2024.12.06	233page
		
		String proverb = "A barking dog"; 
		String s1,s2,s3,s4,s5;
		
		System.out.println("문자열의 길이 : "+proverb.length());

		s1 = proverb.concat(" never Bites!"); 
		System.out.println("문자열 결합 : "+s1);
		
		s2 = proverb.replace('b', 'B'); //proverb 문자열중 b를 대문자 B로 교환
		System.out.println("문자 교환 : "+s2);
		
		s3 = proverb.substring(1,5);//(1,5)에서 1은 begin 5는 end 문자열의 beginIndex에서 시작해서 endIndex 직전까지의 부분 문자열을 반환함.
		System.out.println("부분 문자열 추출 : "+s3); //beginIndex는 이상 endIndex는 미만 이라 생각 하면 될 것 같다.
		
		s4 = proverb.toUpperCase();
		System.out.println("대문자 변환 : "+s4);
		
		s5 = proverb.toLowerCase();
		System.out.println("소문자 변환 : "+s5);
		
		
		int size = "Hello World".length();
		int testSize = s5.length();
		System.out.println(size);
		System.out.println("test :"+testSize);
		
		String subject = "Money";
		String other = " has no value if it is not used";
		String sentence = subject + other;
		System.out.println("문자열 연산자 결합: "+sentence);
		
		
	}

}

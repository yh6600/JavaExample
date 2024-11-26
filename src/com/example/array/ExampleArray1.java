package com.example.array;

public class ExampleArray1 {

	public static void main(String[] args) {
		// 152 page 24.11.26
		
		//1 .배열 선언 및 생성
		//배열 선언과 동시에 배열 생성 ,배열의 크기가 10  
		int [] s = new int[10]; 
		//4.배열의 첫번째 요소에 값을 저장함.
		s[0] = 10;
		System.out.println(" s :" + s[0]+"\n s :"+s[1]);
		//배열을 생성할때 배열의 크기를 변수로 하는방법, 자바에서 배열의 크기가 반드시 상수일 필요는 없음.
		int size =10;
		int [] s1 =new int[size];
		
		//2. 참조 변수 선언방법
		//두 방식은 동일하며 배열참조 변수를 선언 한것임. 
		int[] values1; //자바 방식
		int values2[]; // C언어 유사 방식
		
		//3. 인덱스를 사용한 배열 요소 접근
		int[] s2 = new int [10];
		
		int s3[] = new int [5];
		
	}

}

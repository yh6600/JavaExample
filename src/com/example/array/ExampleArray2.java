package com.example.array;

public class ExampleArray2 {

	public static void main(String[] args) {
		// 157page 24.11.27
		
		//배열의 초기화
		//배열을 선언과 동시에 초기화 하는 방법 , 이때에는 new연산자 를 사용하지 않아도 배열이 생성됨.
		//이러한 방법은 배열에 저장되는 수를 미리 알고있는 경우에 사용 된다.
		int scores[] = {10,20,30,40,50};
		for(int i =0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//배열 참조 변수를 선언후 아래와 같이 초기화 하는것은 오류임.
		/*
		  int x []; x = {1,2,3,4,5};
		 */
		
		//무명 배열 
		int a [];
		a = new int[] {1,2,3,4,5};
		System.out.println("무명배열 a index 1 :"+a[0]);
		
	}

}

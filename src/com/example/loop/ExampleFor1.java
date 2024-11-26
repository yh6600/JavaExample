package com.example.loop;


public class ExampleFor1 {

	public static void main(String[] args) {
		// 24.11.22 
		//증감식 예제1
		for (int i = 0; i <= 10; i++) { 
			  System.out.println("i1 :"+i);
		  }
		//증감식 예제2
		for (int i = 2; i > 0; i--) {
			System.out.println("i2 :"+ i);
		}
		for (int i = 5; i > 0; i--) { 
			  System.out.println("example 2"); 
			  }
		//증가나 감소시킬때 1이 아닌 다른값을 사용할수도있다. i+=4 와 같은경우 0,4,8 일때만 호출되어 3번반복된다. -> i조건식을 < 10으로 정해두었기때문.
		for (int i = 0; i < 10; i+= 4) {
			System.out.println("i증감식이 아닌 값을더하고 할당했을때의 값만큼 출력");
		}
		//콤마연산자로 여러 변수를 초기화 예제 
		for (int i = 0,sum = 0; i < 10; i++) {
			 sum += i;
			 System.out.println("sum : "+sum); 
		 }
		//for 반복처리가 없을때의 예제 
		//while 이나 for 문에서 만약 반복처리할 내용이 없다면 null 문장(null statement)을 사용하는것도 가능. 값이없는 null 아님
		for (int i = 0; i<10; i++) {
			;
		}
		
		//무한루프 예제
		/*
		 * for(; ;) { System.out.println("무한루프"); }
		 */
	}

}

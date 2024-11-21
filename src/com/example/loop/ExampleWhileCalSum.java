package com.example.loop;


public class ExampleWhileCalSum {

	public static void main(String[] args) {
		// 24-11-21 
		
		int i = 1 ; // 변수 i 는 정수 1으로 초기화 
		int sum = 0 ; // 변수 sum 정수 0으로 초기화 
		//while 조건식에 반복횟수를 1부터 10 까지 반복시키는 비교연산자 
		while (i <= 10) {
			//sum = sum + i ; // 초기화한 sum 변수에 증가될 i를 더하고,더해진 sum 변수 누적되어 할당
			sum += i;
			i++; // 변수 i 값을 사용한후 증감연산자 사용.
			//디버깅을 통해 증가 연산자를 지났을때 sum 변수의 값이 +연산과 누적이되어 sum변수에 할당 되는것 을 확인 할수 있었다. 
		}
		System.out.println("sum : "+sum);
		
		}
	}
		
	



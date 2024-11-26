package com.example.nestdloop;

public class ExampleNestedLoop3 {

	public static void main(String[] args) {
		// 24.11.25
		  for (int j = 1; j <= 9; j++) {  // 곱셈의 결과를 출력하는 부분
	            for (int i = 1; i <= 9; i++) {  // 각 단마다 1부터 9까지 곱하기
	                System.out.printf("%d x %d = %2d   ", i, j, i * j);  // 출력 형식 맞추기
	            }
	            System.out.println();  // 한 줄 끝내고 줄바꿈
	        }

	}

}

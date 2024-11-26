package com.example.nestdloop;


public class ExampleNestedLoop7 {

	public static void main(String[] args) {
		// 24.11.26 다이아몬드 예제 
			int n = 5;
		    // 위쪽 삼각형 출력
	        for (int i = 1; i <= n; i++) {
	            // 공백 출력 (가운데 정렬)
	            for (int j = 1; j <= (n - i); j++) {
	                System.out.print(" ");
	            }
	            // 별 출력
	            for (int j = 1; j <= (2 * i - 1); j++) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        for (int i = 4; i >= 1; --i) {
	            // 공백 출력 (가운데 정렬)
	            for (int j = 1; j <= (n - i); j++) {
	                System.out.print(" ");
	            }
	            // 별 출력
	            for (int j = 1; j <= (2 * i - 1); j++) {
	            	System.out.print("*");
	            }
	            System.out.println();
	        }

	
		

	}

}

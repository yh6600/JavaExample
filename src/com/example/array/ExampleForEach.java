package com.example.array;

public class ExampleForEach {

	public static void main(String[] args) {
		// 167page 24.11.27
		
		//for-each loop
		
		int numbers[]= {10,20,30};
		//for-each 변수 value 는 반복이 진행되면서 numbers의 배열의 첫 번째 원소부터 마지막 배열 원소 까지 차례대로 대입됨.
		//배열에서 요소를 하나씩 꺼내어 처리하는 경우라면 for-each를 사용하는것이 권장됨.
		for (int value : numbers) {
			System.out.println(value+" ");
		}
		//동일한 경우의 for 문 , 위에있는 for-each 와 아래의 for 문은 동일함 .
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}

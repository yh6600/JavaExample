package com.example.array;

public class IndexExample {

	public static void main(String[] args) {
		// 156page 24.11.27

		//배열에서 의 인덱스 범위가 중요함을 알려주는 기본 예제
		//배열 scores[] 의 크기는 0에서 4로 선언 되어 있는데 선언된 크기를 넘어선 수가 있을땐 잘못된 메모리 위치를 접근하고 있는것임.
		int scores[]= new int[5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
	//	scores[5] = 60;
		
	}

}

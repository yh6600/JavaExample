package com.oop.classes;

public class SafeArray {
	//24.12.09 248page 
	private int a [];
	public int length;
	
	// 필드값 초기화 a배열 index 크기와 length 값 매개변수 size를 테스트 클래스에서 객체생성시 인수값으로 크기와 길이지정
	public SafeArray(int size) {
		a = new int[size];
		length =size;
	}
	// 반환형이 int 인 get method 에 매개변수 index 선언 
	// index 값이 0보다 작거나 같을때 && index값이 length 보다 클때 a배열의 크기를 index로하여 반환하고 0이하인 음수가 되었을때 -1을 리턴함
	public int get(int index) {
		if(index >= 0 && index < length) {
			System.out.println("허용된 인덱스 범위 " +index);
			return a[index];
		}
		System.out.println("X");
		return -1;
	}
	// put method 배열a의 인덱스 크기와 배열의 값을 나타내는 매개변수 index(크기),value(값) 선언  
	public void put(int index, int value) {
		if(index >= 0 && index< length) {
			a[index] = value;
			System.out.println("value: "+value+" a[index] : "+a[index]+" index :"+index);
			System.out.println();
		} else
			System.out.println("잘못된 인덱스 "+index); // index 의 크기(범위)를 출력 
		
	}

}

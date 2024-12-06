package com.oop.classes;

public class SafeArrayTest {
		public static void main(String[] args) {
			//24.12.09 248page 
			SafeArray array = new SafeArray(5);
			System.out.println("array : "+array.length);
			for (int i = 0; i < (array.length + 1); i++) { //참조변수 array 의 
				array.put(i, i * 10); //첫 번째 i 는 매개변수 index 의 인수 , i * 10 은 value 의 인수 
			}
			array.get(4);
		}

}

package com.oop.classes1;

public class SafeArrayTest {
		public static void main(String[] args) {
			//24.12.09 248page 
			SafeArray array = new SafeArray(5);
			System.out.println("array : "+array.length);
			for (int i = 0; i < (array.length + 1); i++) { //참조�??? array ?? 
				array.put(i, i * 10); //�? �?�? i ?? 매�?�??? index ?? ?��?? , i * 10 ?? value ?? ?��?? 
			}
			array.get(4);
		}

}

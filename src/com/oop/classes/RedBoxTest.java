package com.oop.classes;

public class RedBoxTest {
		public static void main(String[] args) {
			
			RedBox rb = new RedBox("red", 60, 20, 10);
			System.out.println("rb : "+rb.toString());
			
			System.out.println(rb.getVolume());
			
		}
}

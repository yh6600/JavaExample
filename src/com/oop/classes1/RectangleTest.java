package com.oop.classes1;

public class RectangleTest {
	
		public static void main(String[] args) {
			//this() 로 생성자 호출하기	261page
			
			Rectangle rtg = new Rectangle();
			System.out.println(rtg);
			
			//Rectangle 객체의 생성자 매개 변수의 인수값을 rtg_참조변수에 Rectangle 객체를 생성하여 생성자를 호출함. * 객체 생성될때 항상 객체의 생성자가 생성됨.
			Rectangle rtg_ = new Rectangle(10,30);
			System.out.println(rtg_);
		}
		

		
}

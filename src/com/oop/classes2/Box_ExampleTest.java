package com.oop.classes2;

public class Box_ExampleTest {
		public static void main(String[] args) {
			
			//24.12.13	279page
			
			//whosLargest method 는 Box 객체를 받고 Box 객체를 반환하지만 실제로 오가는것은 객체의 참조값(주소값)이다.
			Box_Example obj1 = new Box_Example(10, 20, 50);
			Box_Example obj2 = new Box_Example(10, 30, 30);
			
			Box_Example largest = obj1.whosLargest(obj1, obj2);
			
			System.out.println((largest.width+" "+ largest.length + " "+largest.height+" "));
		
		}
		
}

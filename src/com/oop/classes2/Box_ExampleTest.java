package com.oop.classes2;

public class Box_ExampleTest {
		public static void main(String[] args) {
			
			//24.12.13	279page
			
			//whosLargest method �� Box ��ü�� �ް� Box ��ü�� ��ȯ������ ������ �����°��� ��ü�� ������(�ּҰ�)�̴�.
			Box_Example obj1 = new Box_Example(10, 20, 50);
			Box_Example obj2 = new Box_Example(10, 30, 30);
			
			Box_Example largest = obj1.whosLargest(obj1, obj2);
			
			System.out.println((largest.width+" "+ largest.length + " "+largest.height+" "));
		
		}
		
}

package com.oop.classes2;

public class Box2Test {
	public static void main(String[] args) {
		
		//24.12.13	281page
		
		Box2 obj1 =new Box2(1, 1, 3);
		Box2 obj2 =new Box2(1, 1, 3);
		Box2 obj3 =new Box2(1, 1, 4);
		
		System.out.println("obj1 == obj2 : "+obj1.isSameBox(obj2));
		
		System.out.println("obj1 == obj3 : "+obj1.isSameBox(obj3));
	}
}

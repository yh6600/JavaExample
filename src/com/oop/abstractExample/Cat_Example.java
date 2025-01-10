package com.oop.abstractExample;

public class Cat_Example extends Animal_Example{
	
	public static void eat() {
		System.out.println("Cat_Example 의 정적 메소드 eat()");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat_Example 의 인스턴스 메소드 sound()");
	}
	
	
	public static void main(String[] args) {
		// 25.1.10 358page
		Cat_Example myCat = new Cat_Example();
		
		Animal_Example myAnimal = myCat;
		
		myAnimal.eat();
		myCat.sound();
		
		
	}

}

package com.oop.abstractExample;

public class Cat_Example extends Animal_Example{
	
	public static void eat() {
		System.out.println("Cat_Example �� ���� �޼ҵ� eat()");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat_Example �� �ν��Ͻ� �޼ҵ� sound()");
	}
	
	
	public static void main(String[] args) {
		// 25.1.10 358page
		Cat_Example myCat = new Cat_Example();
		
		Animal_Example myAnimal = myCat;
		
		myAnimal.eat();
		myCat.sound();
		
		
	}

}

package com.oop.abstractExample;


class Animal {
	public void sound() {
		System.out.println("Animal 努贰胶狼 sound()");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("港港");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("具克");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		// 25.1.9	346page
		Animal a1,a2;
		
		Animal a = new Animal();

		a.sound();
		a1 = new Dog();
		a2 = new Cat();
		a1.sound();
		a2.sound();

		
		//====================================
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
		
	}

}

package com.oop.classes1;

public class Student {
	
	//24.12.11	259page ������ �����ε�
	private int number;
	private String name;
	private int age;
	
	Student(){
		number = 3;
		name = "kim";
		age = 18;
	}
	Student(int number,String name,int age){
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

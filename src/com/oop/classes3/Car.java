package com.oop.classes3;

public class Car {
	
	//24.12.13	286page
	
	private String model;
	private String color;
	private int speed;
	
	private int id;
	//���� ��� 
	static int numbers = 0;
	
	public Car(String m, String c,int s) {
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	
	//���� �޼ҵ� 
	public static int getNumberOfCars() {
		return numbers;
	}
}

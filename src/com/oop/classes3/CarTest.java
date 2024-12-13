package com.oop.classes3;

public class CarTest {
	public static void main(String[] args) {
		
			//24.12.13	286page
		
			Car car1 = new Car("S600", "black", 80);
			Car car2 = new Car("E500", "blue", 20);
			//객체가 생성될 때 마다 numbers 가 증가 됨.
			int n = Car.numbers;
			
			System.out.println("생성된 자동차수 : "+n);

			
			int a = Car.getNumberOfCars();
			System.out.println("정적 변수의 값을 반환하는 정적 메소드 : "+a);
			
	}
}

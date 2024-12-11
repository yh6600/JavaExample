package com.oop.method1;

public class CarExamTest {

	public static void main(String[] args) {
		// 24.12.06 222page 

		CarExam car = new CarExam();
		car.changeColor("red");
		car.changeGear(2);
		car.speedUp();
		car.fuelDown(300, 13);
		System.out.println(car);
		
		

	}

}

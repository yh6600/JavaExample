package com.oop.abstractExample;

class Car{
	private String model;

	public Car(String model) {
		this.model = model;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Car)
			return model.equals(( (Car) obj).model);
		else
			return false;
	}
}


public class CarTest {

	public static void main(String[] args) {
		// 25.1.9 350~351 page 
		Car obj = new Car("test");
		System.out.println("obj is of type :"+obj.getClass().getName());

		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 차종");
		}else {
			System.out.println("다른 차종");
		}
	}

}

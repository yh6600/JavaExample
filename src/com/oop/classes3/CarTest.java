package com.oop.classes3;

public class CarTest {
	public static void main(String[] args) {
		
			//24.12.13	286page
		
			Car car1 = new Car("S600", "black", 80);
			Car car2 = new Car("E500", "blue", 20);
			//��ü�� ������ �� ���� numbers �� ���� ��.
			int n = Car.numbers;
			
			System.out.println("������ �ڵ����� : "+n);

			
			int a = Car.getNumberOfCars();
			System.out.println("���� ������ ���� ��ȯ�ϴ� ���� �޼ҵ� : "+a);
			
	}
}

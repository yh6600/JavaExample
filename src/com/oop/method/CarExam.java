package com.oop.method;

public class CarExam {

	
		String color;
		int gear;
		int speed;
		int fuel;
		
	

		@Override
		public String toString() {
			return "CarExam [color=" + color + ", gear=" + gear + ", speed=" + speed + ", fuel=" +  fuel +"L"+ "]";
		}

		void changeColor(String c) {
			color = c;
		}
		
		void changeGear(int g){
			gear = g;
		}

		void speedUp() {
			speed = speed + 10;
		}
		
		void speedDown() {
			speed = speed - 10;
		}
		
		//�Ű������� ����Ÿ� , ����,,, ����� float �̳� double �� ����Ͽ� �ݿø� �� �Ҽ��� n �ڸ� ���� ������ ����ϴ� �޼ҵ� �ۼ��� ����
		int fuelDown (int drive, int  fuelEfficiency){
			return fuel = drive/fuelEfficiency;
		}
		
}

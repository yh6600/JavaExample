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
		
		//매개변수에 주행거리 , 연비,,, 연비는 float 이나 double 을 사용하여 반올림 및 소수점 n 자리 까지 나오게 출력하는 메소드 작성해 볼것
		int fuelDown (int drive, int  fuelEfficiency){
			return fuel = drive/fuelEfficiency;
		}
		
}

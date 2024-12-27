package com.oop.inheritance;

public class SportsCarTest {
	public static void main(String[] args) {
		//24.12.27 306page
		
		SportsCar obj = new SportsCar();
		
		// 부모 클래스의 필드와 메소드 사용 
		obj.speed = 10;
		obj.setSpeed(10);
		
		//SportsCar 의 자체 메소드 사용
		obj.setTurbo(true);
	
	}
}

package com.oop.classes1;

public class StudentTest {
	public static void main(String[] args) {
		
		//24.12.11	259page 생성자 오버로딩
		Student obj = new Student();
		System.out.println("매개 변수가 없는 생성자 "+obj);
	
		Student obj2 = new Student(1,"choi",19);
		System.out.println("생성자 오버로딩 "+obj2);
	}
}

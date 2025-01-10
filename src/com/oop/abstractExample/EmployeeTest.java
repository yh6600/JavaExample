package com.oop.abstractExample;

public class EmployeeTest {

	public static void main(String[] args) {
		// 25.1.10	356page

		Date_Example birth = new Date_Example(1990, 1, 3);
		
		Employee_Example employee = new Employee_Example("choi", birth);
		
		System.out.println(employee);
		
	}

}

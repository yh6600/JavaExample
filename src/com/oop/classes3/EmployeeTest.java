package com.oop.classes3;

public class EmployeeTest {
	public static void main(String[] args) {
		//24.12.13	292page
		
		
		Employee obj1 = new Employee("kim", 0);
		Employee obj2 = new Employee("lee", 1);
		Employee obj3 = new Employee("pack", 2);
		
		int n = Employee.getCount();
		System.out.println("Á÷¿ø¼ö "+n);
	}
}

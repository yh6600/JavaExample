package com.oop.abstractExample;


public class Employee_Example {
	// 25.1.10	356page
	private String name;
	private Date_Example brithDate;
	
	public Employee_Example(String name, Date_Example birth) {
		super();
		this.name = name;
		this.brithDate = birth;
	}
	
	@Override
	public String toString() {
		return "Employee_Example [name=" + name + ", brithDate=" + brithDate + "]";
	}
}

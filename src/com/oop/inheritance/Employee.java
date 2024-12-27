package com.oop.inheritance;

public class Employee {

	//24.12.27 316page
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	
	public Employee(String name, String address, int salary, int rrn) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	
	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	
	
}

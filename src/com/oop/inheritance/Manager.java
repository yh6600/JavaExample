package com.oop.inheritance;

public class Manager extends Employee {

	//24.12.27 316page
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void test() {
		System.out.println("name = "+name);
		System.out.println("address ="+address);
		System.out.println("salary = "+salary);
		//System.out.println(rrn);
	}
}

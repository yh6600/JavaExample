package com.oop.inheritance2;


class Base{
	public Base() {
		// TODO Auto-generated constructor stub
		System.out.println("Base ������");
	}
}

class Derived extends Base{
	public Derived() {
		// TODO Auto-generated constructor stub
		System.out.println("Derived ������");
	}
}

public class DerivedTest {
	public static void main(String[] args) {
		//24.12.30 325page
		Derived r = new Derived();
		
	}
}

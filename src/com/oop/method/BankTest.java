package com.oop.method;

class Bank{
	public double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank{
	@Override
	public double getInterestRate() {
		return 10.0;
	}
}

class NormalBank extends Bank{
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 5.0;
	}
}

class GoodBank extends Bank{
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 3.0;
	}
}

public class BankTest {
	public static void main(String[] args) {
		//24.12.30 323page 
		BadBank b = new BadBank();
		NormalBank n = new NormalBank();
		GoodBank g = new GoodBank();
		
		System.out.println("BadBank 이자율 : "+b.getInterestRate());
		System.out.println("NormalBank 이자율 : "+n.getInterestRate());
		System.out.println("GoodBank 이자율 : "+g.getInterestRate());
	}
}

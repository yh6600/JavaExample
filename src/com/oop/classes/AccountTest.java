package com.oop.classes;



public class AccountTest {

	public static void main(String[] args) {
		// 24.12.09	244page
		
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 "+obj.getName() +" 통장 잔고는 "+ obj.getBalance()+" 입니다.");
		
	}

}

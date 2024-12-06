package com.oop.classes;

class A{

	private int a; 	//전용
	int b;			//디폴트
	public int c;	//공용
}
// 24.12.09	241page
public class Test {
	public static void main(String[] args) {
		A obj = new A();
		
		// obj.a = 1;  전용 멤버는 다른 클래스에서는 접근 x
		obj.b = 2; // 디폴트 멤버는 접근 가능
		obj.c = 3; // 공용 멤버는 접근할 수 있음
	}

}

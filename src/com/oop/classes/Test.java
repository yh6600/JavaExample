package com.oop.classes;

class A{

	private int a; 	//����
	int b;			//����Ʈ
	public int c;	//����
}
// 24.12.09	241page
public class Test {
	public static void main(String[] args) {
		A obj = new A();
		
		// obj.a = 1;  ���� ����� �ٸ� Ŭ���������� ���� x
		obj.b = 2; // ����Ʈ ����� ���� ����
		obj.c = 3; // ���� ����� ������ �� ����
	}

}

package com.oop.classes3;

public class OuterClass {
	// 24.12.13 295page ���� Ŭ����
		private int value =10;
		
		class InnerClass{
			public void myMethod() {
				System.out.println("�ܺ� Ŭ���� private ���� ��: "+value);
			}
		}
		OuterClass(){
			InnerClass obj = new InnerClass();
			obj.myMethod();
		}
}


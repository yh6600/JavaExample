package com.oop.classes3;

public class OuterClass {
	// 24.12.13 295page 내부 클래스
		private int value =10;
		
		class InnerClass{
			public void myMethod() {
				System.out.println("외부 클래스 private 변수 값: "+value);
			}
		}
		OuterClass(){
			InnerClass obj = new InnerClass();
			obj.myMethod();
		}
}


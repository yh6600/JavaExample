package com.oop.classes2;

public class MyCount2_ExampleTest {
		public static void main(String[] args) {
			//24.12.12	274page
			
			//실행 결과에서 확인 할 수 있듯이 inc() 안에서 객체를 변경하면 인수로 사용된 객체도 변경된다.
			MyCount2_Example obj = new MyCount2_Example();
			System.out.println(obj.value);
			
			obj.inc(obj);
			
			System.out.println(obj.value);
		}
}

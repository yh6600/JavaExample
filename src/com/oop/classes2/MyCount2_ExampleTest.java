package com.oop.classes2;

public class MyCount2_ExampleTest {
		public static void main(String[] args) {
			//24.12.12	274page
			
			//���� ������� Ȯ�� �� �� �ֵ��� inc() �ȿ��� ��ü�� �����ϸ� �μ��� ���� ��ü�� ����ȴ�.
			MyCount2_Example obj = new MyCount2_Example();
			System.out.println(obj.value);
			
			obj.inc(obj);
			
			System.out.println(obj.value);
		}
}

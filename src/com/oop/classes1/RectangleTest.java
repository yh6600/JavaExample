package com.oop.classes1;

public class RectangleTest {
	
		public static void main(String[] args) {
			//this() �� ������ ȣ���ϱ�	261page
			
			Rectangle rtg = new Rectangle();
			System.out.println(rtg);
			
			//Rectangle ��ü�� ������ �Ű� ������ �μ����� rtg_���������� Rectangle ��ü�� �����Ͽ� �����ڸ� ȣ����. * ��ü �����ɶ� �׻� ��ü�� �����ڰ� ������.
			Rectangle rtg_ = new Rectangle(10,30);
			System.out.println(rtg_);
		}
		

		
}

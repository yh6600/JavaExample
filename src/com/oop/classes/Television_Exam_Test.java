package com.oop.classes;

public class Television_Exam_Test {
	public static void main(String[] args) {
		
		Television_Exam tv = new Television_Exam(5, 3, true);
		System.out.println("tv1 : "+tv.toString());
	
		Television_Exam tv2 = new Television_Exam(0, 0, false);
		System.out.println("tv2 : "+tv2.toString());
	}
}

package com.oop.classes1;

public class Time_ExamTest {
	public static void main(String[] args) {
		//24.12.12	266page
		
		Time_Exam time = new Time_Exam();
		System.out.println(time.toString());
		
		Time_Exam time2 = new Time_Exam(13,27,6);
		System.out.println(time2.toString());
		
		Time_Exam time3 = new Time_Exam(88,61,62);
		System.out.println(time3.toString());
	}
}

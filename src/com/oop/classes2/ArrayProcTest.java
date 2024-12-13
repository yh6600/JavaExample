package com.oop.classes2;

public class ArrayProcTest {
	
	final static int STUDENT = 5;
	
	public static void main(String[] args) {
		//24.12.12	277page
		
		int[] scores =  new int[STUDENT];
		
		ArrayProc obj = new ArrayProc();
		
		obj.getValue(scores);
		
		System.out.println(obj.getAverage(scores));
	}
}

package com.oop.classes3;

public class Employee {

		//24.12.13	292page
		private String name;
		private double salary;
		static int count = 0;
		
		public Employee(String n,double s) {
			name = n;
			salary = s;
			
			count++;
		}
		
		protected void finalize() {
			count--;
		}
		
		public static int getCount() {
			return count;
		}
		
		
		
}

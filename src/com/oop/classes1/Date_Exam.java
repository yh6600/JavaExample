package com.oop.classes1;

public class Date_Exam {
	
	
		//24.12.11 	263page
	
		private int year;
		private String month;
		private int day;
		
		//��ü ������ �����ڷ� ���� �μ��� ���� 
		Date_Exam(int y, String m, int d){
			this.year = y;
			this.month = m;
			this.day = d;
		}
		//
		Date_Exam(int y){
			this(y,"1��",1);
		}
		
		Date_Exam(){
			this(1900,"1��",1);
		}
		@Override
		public String toString() {
			return "Date_Exam [year=" + year + ", month=" + month + ", day=" + day + "]";
		}
		
		
	
		
}

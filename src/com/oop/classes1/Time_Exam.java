package com.oop.classes1;

public class Time_Exam {
	//24.12.12	266page
	
	private int hour;
	private int minute;
	private int second;
	
	//��ü�� �ʵ� �ʱ�ȭ �ϴ� ������ 
	Time_Exam(){
		this(0,0,0);
	}
	//�� �ʵ��� ������ �ɾ ��, �� , �� �� ��Ÿ��
	Time_Exam(int h,int m, int s){
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s <60) ? s : 0);
	}
	

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}	
	
	
}

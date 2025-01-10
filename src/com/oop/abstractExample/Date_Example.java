package com.oop.abstractExample;

public class Date_Example {
	// 25.1.10	356page
	private int year;
	private int month;
	private int date;
	
	public Date_Example(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Date_Example [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
}

package com.example.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExampleDate {

	public static void main(String[] args) {
		// 111 ~ 112 page
		
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println("timePoint : "+timePoint);
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println("theDate : "+theDate);
		
		Month month = timePoint.getMonth();
		System.out.println("month : "+month);
		
		int day =timePoint.getDayOfMonth();
		int currentHour = timePoint.getHour();
		
		System.out.println(day+" , "+currentHour);
	}

}

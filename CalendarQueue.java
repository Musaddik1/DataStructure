package com.DataStructure;

import java.util.Scanner;

public class CalendarQueue {
	
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month :");
		int month=scanner.nextInt();
		System.out.println("Enter year :");
		int year=scanner.nextInt();
		UtilCalendarQueue calendar=new UtilCalendarQueue();
		calendar.calendarQueue(month, year);
		
	}

}

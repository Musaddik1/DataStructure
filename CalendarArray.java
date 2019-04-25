package com.DataStructure;

import java.util.Scanner;

public class CalendarArray {
	
	public static int dayOfWeek(int d, int m, int y) 
	{
		
		int y1=y-(14-m)/12;
		int x1=(y1+y1/4)-(y1/100)+y1/400;
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x1+31*(m1/12))%7;
		return d1;
		
	}
	
	public void printCalendar(int month,int year)
	{
		String[] Months ={"January","February","March","April","May","June","July","August",
						"Saptember","October","Novembe","December"};
		
		int [] noOfDays= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int result=dayOfWeek(1,month,year);
		
		System.out.println("\n"+"   "+Months[month-1]+"  "+year);
	
		if(month==2 && isLeapYearForCalender(year))
		{
			noOfDays[2]=29;
		}
		System.out.println("S  M  T  W  T  F  S  ");
		for(int i=0;i<result;i++)
		{
			System.out.print("   ");
		}
		for(int i=1;i<=noOfDays[month];i++)
		{
			if(i<=9)
			{
				System.out.print(i+"  ");
			}
			else 
			{
				System.out.print(i+" ");
			}
			if((result+i)%7==0)
			{
				System.out.println();
			}
			
		}

	}
		

		public static boolean isLeapYearForCalender(int year)
		{
			if(year%4==0 || year%400==0 && year%100!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Month ");
		int month=scanner.nextInt();
		System.out.println("enter Year ");
		int year=scanner.nextInt();
		CalendarArray calendar=new CalendarArray();
		calendar.printCalendar(month, year);
	}	
	

}

package com.DataStructure;

public class UtilCalendarQueue 
{
	
	public void calendarQueue(int month,int year)
	{
		System.out.println("hello");
		String months[]= {"January","February","March","April","May","June","July","August",
				"Saptember","October","Novembe","December"};
		QueueCalendar queue=new QueueCalendar();
		int d=1;
		int m=month;
		int y=year;

		int y1=y-(14-m)/12;
		int x1=(y1+y1/4)-(y1/100)+y1*400;
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x1+31*(m1/12))%7;
		int start=d1;
		int totalDay=0,count=1;
		if(month==2)
		{
			if(UtilCalendarQueue.leapYear(year))
			{
				totalDay=29;
			}
			else
			{
				totalDay=28;
			}
		}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			totalDay=31;
		}
		else
		{
			totalDay=30;
		}
 		while(start!=0)
 		{
 			queue.enqueue("  ");
 			start++;
 		}
 		while(count<=totalDay)
 		{
 			if(count<=9)
 			{
 				queue.enqueue(String.valueOf(count)+" ");
 			}
 			else
 			{
 				queue.enqueue(String.valueOf(count)+" ");
 			}
 			count++;
 		}
 		System.out.println(" "+months[month-1]+" "+year);
 		System.out.print("S  M  T  W  T  F  S");
 		System.out.println("");
 		count=1;
 		while(!queue.isEmpty())
 		{
 			String result=queue.dequeue();
 			System.out.println(result);
 			if(count%7==0)
 			{
 				System.out.println();
 			}
 			count++;
 		}
	}
	public static boolean leapYear(int year)
	{
		if(year%4==0&&year%400==0)
		{
			return true;
		}
		else if(year%100==0)
		{
			return false;
		}
		else
		{
			return false;
		}
	}

}

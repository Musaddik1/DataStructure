package com.DataStructure;

import java.util.Scanner;

import com.BridgelabzFun.prime;


public class Prime 
{
	
	public static boolean prime(int number)
	{
		int i,j,count=0,len=0;
		
			for(j=1;j<=number;j++)
			{
				if(number%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				return true;
					
			}
			else
			{
				return false;
			}
	
	}
		
	
	public static void main(String[] args) {
	
		int array[]=new int[168];
		int k=1;
		int i=0;
		int n=1;
		while(i<168)
		{
			if(Prime.prime(k)==true)
			{
				array[i]=k;
				i++;
				n++;
			}
		k++;
		
			
		}
		int m=0;
		int array1[][]=new int[10][17];
		for(int j=0;j<10;j++)
		{
			for(int l=0;l<17;l++)
			{
				if(array.length>m)
				{
					array1[j][l]=array[m];
					m++;
				}
			}
		}
		for(int j=0;j<10;j++)
		{
			for(int l=0;l<17;l++)
			{
				System.out.print(array1[j][l]+"\t");
			}
			System.out.println("\n");
		}
	}

}

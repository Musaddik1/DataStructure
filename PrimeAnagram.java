package com.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAnagram 
{
		public static void main(String[] args) 
		{
		Scanner scanner=new Scanner(System.in);
		UtilityPrimeAnagram prime=new UtilityPrimeAnagram();
		System.out.println("Enter number :");
		int number=scanner.nextInt();
		int i=0;
		int k=1;
		int m=0;
		int array[]=new int[168];
		array=prime.Prime(number);
		int anagram[]=prime.Anagram(array);
		int array2[][]=new int[10][20];
		for(int l=0;l<10;l++)
		{
			for(int j=0;j<17;j++)
			{
				if(array.length>m)
				{
				array2[l][j]=anagram[m];
				m++;
				}
			}
		}
		for(int l=0;l<10;l++)
		{
			for(int j=0;j<17;j++)
			{
				if(array2[l][j]!=0)
				System.out.print(array2[l][j]+"  ");
			}
			System.out.println("");
		}
		
	}
}

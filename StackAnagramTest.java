package com.DataStructure;

import java.util.Scanner;
/*
 *@Musaddik shaikh
 *Program for StackAnagram 
*/
public class StackAnagramTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=scanner.nextInt();
		UtilityPrimeAnagram check=new UtilityPrimeAnagram();
		StackAnagram anagram=new StackAnagram();
		int array[]=new int[168];
		array=check.Prime(number);
		array=check.Anagram(array);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				anagram.Insert(array[i]);
			}
		}
		anagram.display();
	}

}

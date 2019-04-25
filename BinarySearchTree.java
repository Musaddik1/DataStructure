package com.DataStructure;

import java.util.Scanner;

public class BinarySearchTree {
	
	public static double fact(double number)
	{
		int fac=1;
		for(int i=1;i<=number;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		double number=scanner.nextInt();
		double num1=fact(number*2);
		double num2=fact(number+1);
		number=fact(number);
			
		double value=num1/(num2*number);
		System.out.println(value+" Tree can be created using  "+number+" nodes");
	}

}

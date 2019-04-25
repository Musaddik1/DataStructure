package com.DataStructure;

import java.util.Scanner;

public class Banking {
	
	static int amount=2000;
	public static void Withdraw(int balance)
	{
		amount=amount-balance;
		System.out.println("Withdraw Amount :"+balance);
		System.out.println("Amount :"+amount);
	}
	public static void Deposit(int balance)
	{
		amount=amount+balance;
		System.out.println("Deposite Amount :"+balance);
		System.out.println("Amount :"+amount);
	}
	public static void main(String[] args) {
		BankingQueue queue=new BankingQueue();
		int choice;
		char ch;
		Scanner scanner=new Scanner(System.in);
		
		int data;
		int balance;
		do
		{
			System.out.println("\n1.Deposite\n2.Withdraw\nEnter Your choice :");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Person :");
				data=scanner.nextInt();
				queue.enqueue(data);
				System.out.println("Enter Amount to Deposite");
				balance=scanner.nextInt();
				Banking.Deposit(balance);
				System.out.println("Person Entered :");
				queue.dequeue();
				System.out.println("Deposited money");
				break;
			case 2:
				System.out.println("Enter Person :");
				data=scanner.nextInt();
				queue.enqueue(data);
				System.out.println("Enter Amount to Withdraw ");
				balance=scanner.nextInt();
				Banking.Withdraw(balance);
				System.out.println("Person Entered :");
				queue.dequeue();
				System.out.println("Withdraw money");
				break;
			default:
				System.out.println("You entered wrong choice :");
			}
			System.out.println("Do you want to continue :[y/n]");
			 ch=scanner.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		
	}

}

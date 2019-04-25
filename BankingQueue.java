package com.DataStructure;

public class BankingQueue {
	int array[]=new int[10];
	int rear=0;
	int front=0;
	public boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	public boolean isFull()
	{
		if(rear==10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Overflow");
		}
		else
		{
			array[rear]=data;
			rear++;
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
		}
		else
		{
			front++;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
		}
		else
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(array[i]);
			}
		}
	}


}

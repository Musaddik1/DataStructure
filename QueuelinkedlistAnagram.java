package com.DataStructure;

public class QueuelinkedlistAnagram {
	
	class Node 
	{
		int data;
		Node next;
		
	}
	Node front=null;
	Node rear=null;
	public boolean isEmpty()
	{
		if(front==null && rear==null)
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
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(front==null)
		{
			front=node;
			rear=node;
		}
		else
		{
			rear.next=node;
			rear=node;
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
			Node node=front;
			front=front.next;
			
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Underflow ");
		}
		else
		{
			Node node=front;
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		}
	}

	public static void main(String[] args) {
		
		QueuelinkedlistAnagram list=new QueuelinkedlistAnagram();
		UtilityPrimeAnagram prime=new UtilityPrimeAnagram();
		int number=1000;
		int array[]=new int[168];
		array=prime.Prime(number);
		array=prime.Anagram(array);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			list.enqueue(array[i]);
		}
		list.display();
		
	}
}

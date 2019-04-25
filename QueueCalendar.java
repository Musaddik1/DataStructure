package com.DataStructure;

public class QueueCalendar{
	
	class Node
	{
		String data;
		Node next;
	}
	Node front=null;
	Node rear=null;
	public boolean isEmpty()
	{
		if(front==null &&rear==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enqueue(String data)
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
	public String dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return  "";
		}
		else
		{
			Node node=front;
			String no= node.data;
			front=front.next;
			return no;
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
			Node node=front;
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		}
	}
	
	
}

package com.DataStructure;



public class StackAnagram {
	class Node
	{
		int data;
		Node next;
	}
	Node head=null;
	public void Insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public void Remove()
	{
		Node temp=head;
		head=head.next;
		
		
	}
	public void display()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}

}

package com.DataStructure;

public class Stack<T> {

	class Node <T> 
	{
		Object data;
		Node next;
	}
	Node top=null;
	public void Push(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=top;
		top=node;
	}
	public T pop()
	{
		Node node=top;
		top=top.next;
		return (T) node.data;
		
	}
	public boolean IsEmpty()
	{
		
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public T peek()
	{
		Node node=top;
		if(IsEmpty())
		{
			return null;
		}
		else
		{
			return (T) node.data;
		}
	}
	public int Size()
	{
		Node node=top;
		int count=0;
		while(node!=null)
		{
			count++;
			node=node.next;
		}
		return count;
	}
}

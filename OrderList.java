package com.DataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderList 
{
	class Node
	{
		int data;
		Node next;
		
	}
	Node head=null;
	public void insert(int data)
	{
		Node node=new Node();
	
			node.data=data;
			node.next=head;
			head=node;
		
		
	}
	public void Remove()
	{
		Node node=head;
		head=node.next;
		
			
		
		
	}
	public void Isempty()
	{
		Node node=head;
		if(head==null)
		{
			System.out.println("Linkedlist is empty :");
		}
	}
	public int size()
	{
		Node node=head;
		int count=0;
		while(node!=null)
		{
			count++;
			node=node.next;
		}
		return count;
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
	public void Index(Node head,int index)
	{
		int count=1;
		Node node=head;
		while(node!=null)
		{
			if(count==index)
			{
				System.out.println("data present at "+index+" "+node.data);
			}
			node=node.next;
			count++;
		}
	}
	public void Search( Node head,int key)
	{
		Node node=head;
		while(node!=null)
		{
			if(node.data==key)
			{
				System.out.println("Element found "+node.data);
				break;
			}
			node=node.next;
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		OrderList list=new OrderList();
		File file=new File("number.txt");
		Scanner scanner=new Scanner(file);
		Scanner scanner1=new Scanner(System.in);
		int len=(int) file.length();
		int array[]=new int[len];
		int i=0;
		int no;
		while(scanner.hasNext())
		{
			no=scanner.nextInt();
			array[i]=no;
			i++;
			
		}
		
		Arrays.sort(array);
		for(int j=array.length-1;j>=0;j--)
		{
			if(array[j]!=0)
			list.insert(array[j]);
		}
		list.display();
		list.Index(list.head, 3);
		list.Search(list.head, 5);
		list.Remove();
		list.display();
	}
}



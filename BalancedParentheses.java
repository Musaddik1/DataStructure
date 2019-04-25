package com.DataStructure;

/*
 * @Musaddik shaikh
 * Program for Parentheses 
*/
public class BalancedParentheses
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("String :(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		char str[]="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)((".toCharArray();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=='(')
			{
				stack.Push(str[i]);
			}
			else if(str[i]==')')
			{
				stack.pop();
				
			}
		}
		if(stack.IsEmpty())
		{
			System.out.println("Balanced Parentheses ");
		}
		else
		{
			System.out.println("Unbalanced Parentheses ");
		}
	}

}

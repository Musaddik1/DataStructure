package com.DataStructure;

import java.util.Arrays;

public class UtilityPrimeAnagram 
{
		public int[] Prime(int number)
		{
			int array[]=new int[168];
			int count=0;
			int k=0;
			for(int i=2;i<=number;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
					count++;
					}			
				}
				if(count==2)
				{
					array[k]=i;
					k++;
				}
				
				count=0;
			}
			return array;
			
		}
		public int[] Anagram(int[] array)
		{
			int anagram[]=new int[array.length];
			int number=0;
			UtilityPrimeAnagram prime=new UtilityPrimeAnagram();
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array.length;j++)
				{
					if(array[i]>0&&array[j]>0&&array[i]!=array[j])
					{
						String string1=Integer.toString(array[i]);
						String string2=Integer.toString(array[j]);
						number=prime.checkAnagram(string1, string2);
						if(number>0)
						{
							anagram[i]=number;
						}
					}
				}
			}
			return anagram;
		}
		public int checkAnagram(String string1,String string2)
		{
			int anagram=0;
			char ch1[]=string1.toCharArray();
			char ch2[]=string2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
			if(result==true)
			{
				anagram=Integer.parseInt(string1);
				
				return anagram;
				
			}
			
			return anagram;
		}


}

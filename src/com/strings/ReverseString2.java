package com.strings;

import java.util.Scanner;

public class ReverseString2 {
	

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		str=str.toLowerCase();
			
		char ch[]=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}
		

	
}
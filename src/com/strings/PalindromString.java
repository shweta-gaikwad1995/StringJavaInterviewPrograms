package com.strings;

public class PalindromString {

	public static String input = "abba";
	public static String ReverseWord="";
	
	

	public static void main(String[] args) {

		System.out.print("ReverseWord : = " );
		for(int i=input.length()-1;i>=0;i--)
		{
			ReverseWord=ReverseWord+input.charAt(i);
		}
		System.out.println(""+ReverseWord);
		
		if(input.equals(ReverseWord))
		{
			System.out.print("It Palindrome String");
		}
		else {
			System.out.print("Not Palindrome String");
		}
	}

}

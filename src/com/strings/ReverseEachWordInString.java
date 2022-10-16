package com.strings;

public class ReverseEachWordInString {

	static String input = "java code";

	public static void main(String[] args) {
		
		// Input String java codelength = 9
		System.out.println("Input String " +input+ "length = "  +input.length());
		
		// Remove space by using split()
		String words[] = input.split(" ");
		
		String reverseWord="";
		String output="";
		
		for(String word: words)
		{
			for(int i= word.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+word.charAt(i);
			}
			
			// Count the Space " "
			output=output+reverseWord+" ";
		}
		System.out.println(output);
	

	}

}

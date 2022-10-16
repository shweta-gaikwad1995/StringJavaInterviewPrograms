package com.strings;
//Java Program To Find Occurrence Of Each Character | Ashok IT


//    https://www.youtube.com/watch?v=NNOGY0Wd50w&list=PLpLBSl8eY8jQAscb73Z8Auxi3pEWuiUNx&index=8


public class ReverseString {

	static String input = "Hello";

	public static void main(String[] args) {
		
	char[] ch=input.toCharArray();
	
	int len=ch.length;
	System.out.println("length of string = "+len);
	
	
	//		i=5-1  ;4-1 ;3
	for(int i=len-1;i>=0;i--)
	{
		
		System.out.print(ch[i]+" "); // o l l e H 
	}
	
	}

}

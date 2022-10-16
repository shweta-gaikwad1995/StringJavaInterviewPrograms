package com.strings;

import java.util.Arrays;

public class AnagramStrings {

	public static String str1 = "listen";
	public static String str2 = "SILENT";
	

	public static void main(String[] args) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			
			// Convert string to character Array using toCharArray()
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
		boolean result=	Arrays.equals(charArray1, charArray2);
		
		if(result == true)
		{
			System.out.println(" "+ str1 + " and " + str2 + " are Anagram ");
		}
		else {
			System.out.println(" "+ str1 + " and " + str2 + " Not Anagram ");
		}
		}

	}

}

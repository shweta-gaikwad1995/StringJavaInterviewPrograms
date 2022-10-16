package com.strings;

public class StringConsonant_Digits_Number_Space_SpecialCharcter_Vowel {

	public static String str = "shweta GAIKWAD123456@$";

	public static char ch;
	public static int consonant=0;

	public static int vowels=0;
	public static int space=0;
	public static int digit=0;
	public static int specialCharacter=0;

	public static void main(String[] args) {
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			ch=	str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='w')
				{
					consonant++;
				}
				else {
					vowels++;
				}
			}
			if(ch==' ')
			{
				space++;
			}
			else if(ch!=' ')
			{
				specialCharacter++;
			}
			if(ch>='0'&&ch<='9')
			{
				digit++;
			}
		}
		System.out.println("Consonanat : = "+consonant); // 7
		System.out.println("Vowels : = "+vowels);		// 6
		System.out.println("Space : = "+space);			// 1
		System.out.println("Digit = "+digit);			// 6
		System.out.println("SpecialCharacter "+specialCharacter);
		
	}
	}


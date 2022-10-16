package com.strings;

public class UpperToLower {

	public static String UpperCase = "ABCDE";

	public static void main(String[] args) {

		System.out.println("Uppercase letter := " + UpperCase);
		System.out.print("Lowercase letter : = ");

		
		/**
		 * Converison of String to CharacterArray 
		 * using toCharArray()
		 */
		char strArr[] = UpperCase.toCharArray();
		
		
		
		
		/**
		 * To convert a lowercase alphabet to
		 *  uppercase alphabet – we can subtract 32 from 
		 *  lowercase alphabet's ASCII code to make it an 
		 *  uppercase alphabet (because the difference between a lowercase 
		 * alphabet ASCII and an uppercase alphabet ASCII is 32).
		 */
		for(int i=0;i<strArr.length;i++)
		{
			//lowercase  a=97, z=256
			//uppercase   a=65 , Z=90
			
				if(strArr[i]>='A' && strArr[i]<='Z')
				{
					strArr[i]=(char)((int) strArr[i]+32);
				}
				
			
				
		}
		
		
		for(int i=0;i<strArr.length;i++)
		{
			System.out.print(strArr[i]);
			
			
		}
	}

}

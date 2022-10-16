package com.strings;

public class LowerToUpper {

	public static String lowercase = "abcde";

	public static void main(String[] args) {

		System.out.println("Lowercase : = " + lowercase);
		/**
		 * To convert a lowercase alphabet to
		 *  uppercase alphabet – we can subtract 32 from 
		 *  lowercase alphabet's ASCII code to make it an 
		 *  uppercase alphabet (because the difference between a lowercase 
		 * alphabet ASCII and an uppercase alphabet ASCII is 32).
		 */
		
		
		/**
		 * Converison of String to CharacterArray 
		 * using toCharArray()
		 */
		
	char[] ch=	lowercase.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<ch.length;j++)
		{
			//lowercase  a=97, z=256
			//uppercase   a=65 , Z=90
			if(ch[i]>='a' && ch[j]<='z')
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
		System.out.print(ch[i]);
	}
	//j=0
	
	}

}

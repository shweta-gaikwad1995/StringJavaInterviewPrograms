package com.strings;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		String s = "abcde";

		try {
			String str = new String(s);
			
			//Length of String abcde = 5
			System.out.println("Length of String "  + str + " = "+str.length());
			
		
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}

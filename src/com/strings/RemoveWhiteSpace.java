package com.strings;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	
		String str="Shweta Gaikwad";
		System.out.println(" Before Removing Space := "+str.toString());
		str=str.replaceAll("\\s", "");
		System.out.println("After Removing space := "+str.toString());
	
	}

}

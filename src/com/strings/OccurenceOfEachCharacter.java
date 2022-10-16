package com.strings;

import java.util.HashMap;
import java.util.Map;

//Java Program To Find Occurrence Of Each Character | Ashok IT

/**
 * https://www.youtube.com/watch?v=NNOGY0Wd50w&list=PLpLBSl8eY8jQAscb73Z8Auxi3pEWuiUNx&index=8
 * 
 *
 */

public class OccurenceOfEachCharacter {

	static String input = "Hello";

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap();
		char chars[] = input.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
		}
		System.out.println(map);
	}

}

package com.test.automation.demo;

import java.util.HashMap;
import java.util.Map;

public class stringoccurrence {

	public static void main(String[] args) {

		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		String str = "Nagarjuna Yalamanchili";
		
		for(Character c:str.toCharArray()) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}
			else {
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}
}
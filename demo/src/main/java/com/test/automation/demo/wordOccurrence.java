/**
 * 
 */
package com.test.automation.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nagarjuna
 *
 */
public class wordOccurrence {
	
	public static void main(String [] args) {
		duplicateWords("Hey java is java best language is java");
	}

	
	public static void  duplicateWords(String inputstring) {
		
		String[] str = inputstring.split(" ");
		
		Map<String, Integer> count = new HashMap<String, Integer>();
		for(String c: str) {
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}
			else 
			{
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}
}

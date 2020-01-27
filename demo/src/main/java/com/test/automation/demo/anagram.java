/**
 * 
 */
package com.test.automation.demo;

import java.util.Arrays;

/**
 * @author nagarjuna
 *
 */
public class anagram {

	public static boolean anagram(String str1, String str2) {
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);	
	}
	
	public static void main(String args[]) {
		String str1 = "Nagarjuna";
		String str2 = "Nagarjuna";
		System.out.println(anagram(str1, str2));
	}
}

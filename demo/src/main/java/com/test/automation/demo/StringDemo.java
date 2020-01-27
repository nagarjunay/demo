/**
 * 
 */
package com.test.automation.demo;

/**
 * @author nagarjuna
 *
 */
public class StringDemo {
	
	public static void main(String args[]) {
	String str = "bang123";
	String output = str.replaceAll("[^0-9]", "");
    System.out.println(output);
}
}
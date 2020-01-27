package com.test.automation.demo;

public class palindrome {

	public static void main(String[] args) {

		String res = "", str = "121";
		for(int i=str.length()-1; i>=0; i--) {
			res = res + str.charAt(i);
		}
		
		if(res.equals(str)) 
			System.out.println("Given number is palindrome");
			else
				System.out.println("Given number is not palindrome");
		
}
}

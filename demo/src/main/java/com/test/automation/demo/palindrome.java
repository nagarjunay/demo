package com.test.automation.demo;

public class palindrome {

	public static void main(String[] args) {

		String res = "", str = "122";

		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}

		if (str.equals(res))
			System.out.println("Palindrome");
		else
			System.out.println(" Not a Palindrome");

	}
}

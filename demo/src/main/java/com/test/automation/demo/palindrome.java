package com.test.automation.demo;

import java.io.FileNotFoundException;

public class palindrome {

	public static void main(String[] args)  {

	/*	int n = 233, r, sum = 0, temp;
		temp = n;
		
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Given number is a palindrome");
		else
			System.out.println("Given number is not a palindrome");*/
		try {
			method();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		 
		
	}
	
	public static void method() throws FileNotFoundException {
		
		int a = 10/0;
		//throw new ArithmeticException("some error");
	}
}

package com.test.automation.demo;

public class armstrongNumber {

	public static void main(String[] args) {

		int n = 153, temp, a, c = 0;

		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Given number is a Armstrong");
		else
			System.out.println("Given number is not a Armstrong");

	}
}

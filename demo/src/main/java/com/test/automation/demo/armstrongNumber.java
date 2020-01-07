package com.test.automation.demo;

public class armstrongNumber {

	public static void main(String[] args) {

		int n = 152, temp = 0, a, c = 0;

		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a armstrong number");
	}
}

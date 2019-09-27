package com.test.automation.demo;

import java.util.Scanner;

public class DiamnodPattern {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number ");
		int n = scan.nextInt();
		int space = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int k = 0; k <= i; k++)
				System.out.print("* ");
			System.out.println("");
			space--;
		}
		space = 0;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int k = 0; k < i; k++)
				System.out.print("* ");
			System.out.println("");
			space++;
		}
	}

}

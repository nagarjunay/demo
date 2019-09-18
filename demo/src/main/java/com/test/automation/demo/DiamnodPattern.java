package com.test.automation.demo;

public class DiamnodPattern {

	static void drawPattern(int n) {

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
		for (int i = n; i >0; i--) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int k = 0; k <i; k++)
				System.out.print("* ");
			    System.out.println("");
			space++;
		}
	}

	public static void main(String args[]) {
		drawPattern(4);
	}

}

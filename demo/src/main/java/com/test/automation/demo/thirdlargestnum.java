package com.test.automation.demo;

public class thirdlargestnum {

	public static int getThirdLargestNum(int[] a, int total) {

		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[total - 1];

	}

	public static void main(String args[]) {
		int a[] = { 2, 4, 3, 5, 6, 8, 9 };
		System.out.println("Third largest number is " + getThirdLargestNum(a, 7));
	}

}

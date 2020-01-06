/**
 * 
 */
package com.test.automation.demo;

/**
 * @author nagarjuna
 *
 */
public class star {

	/**
	 * @param args
	 */
	public static int getlargestnum(int a[], int total) {
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
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 56, 67, 45 };

		System.out.println(getlargestnum(a, 6));
	}
}

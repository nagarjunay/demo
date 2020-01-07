
package com.test.automation.demo;

public class thirdlargestnum {

	public static int getLargestNum(int a[], int total) {
		
		int temp;
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;	
				}
			}
		}
		return a[total-1];	
	}
	
	public static void main(String args[]) {
		int a[] = {567, 78, 89, 60, 345};
		System.out.println(getLargestNum(a, 5));
	}
}


package com.test.automation.demo;

public class thirdlargestnum {

	public static int thirdLargestNum(int []a , int total) {
		
		int temp =0;
		
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++ ) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total -1];
		
	}
	
	public static void main(String args[]) {
		int a[] = {10, 345, 30, 56, 67};
		System.out.println(thirdLargestNum(a, 5));
		
}
}

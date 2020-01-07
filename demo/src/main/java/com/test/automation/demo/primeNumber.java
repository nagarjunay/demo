/**
 * 
 */
package com.test.automation.demo;

/**
 * @author nagarjuna
 *
 */
public class primeNumber {

	public static boolean isPrime(int num) {
		if(num==1) {
			return true;
			
		}
		else
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return true;
			}
		}
		return false;
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(isPrime(4));
	}
}

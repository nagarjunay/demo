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
		
		for(int i=2; i*i<=num; i++) {
			if(i%num == 0) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String args[]) {
		System.out.println(isPrime(5));
	}
	
}

package com.test.automation.demo;

public class armstrongNumber {

	public static void main(String[] args) {
		int n=153, temp, a, c=0;
		
		temp = n;
		while(n>0) {
		a = n%10;
		n = n/10;
		c = c + (a*a*a);
	}
		if(temp==c)
			System.out.println("Given input is armstrong number");
		else 
			System.out.println("Given input is not a armstrong number");	

}}

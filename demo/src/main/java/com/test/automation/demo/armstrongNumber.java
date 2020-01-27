package com.test.automation.demo;

public class armstrongNumber {

	public static void main(String[] args) {

      int n= 154, a, c=0, temp = 0;
      n = temp;
      while(n>0) {
    	  a = n%10;
    	  n = n/10;
    	  c = c+ (a*a*a);
      }
      if(temp == c)
    	  System.out.println("Given number is anagram");
      else
    	  System.out.println("Given number is not anagram");
	}
}

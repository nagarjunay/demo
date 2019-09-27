package com.test.automation.demo;

/**
 * Hello world!
 *
 */
public class Prime_number 
{
	public static void main(String[] args) {


      int n = 7, temp=0;
      for(int i = 2; i<=n-1; i++) {
    	  if(n%i==0) {
    		  temp = temp+1;
    	  }
      }
    	  if(temp==0) {
    		  System.out.println("Given number is a prime");
    	  }
    	  else {
    		  System.out.println("Given number is not a prime");
    	  }
     

}
}

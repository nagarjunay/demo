package com.test.automation.demo;

/**
 * Hello world!
 *
 */
public class Prime_number 
{
    public static void main( String[] args )
    {
       int n=29;
       boolean isPrime=true;
       
       for(int i=2; i<n;i++) {
    	   if(n%i==0)
    	   isPrime = false;
    	    
       }
       if(isPrime)
    	   System.out.println("Given number is prime");
       else
    	   System.out.println("Given number is not a prime");
    }
}

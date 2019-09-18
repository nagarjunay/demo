package com.test.automation.demo;

/**
 * Hello world!
 *
 */
public class Prime_number 
{
    public static void main( String[] args )
    {
          int num=24, temp=0;
          
          for(int i=2; i<=num-1; i++) {
        	  if(num%i==0) {
        		  temp=temp+1;  
        	  }
          }
          if(temp==0) {
        	  System.out.println("Given number is prime");
          }
          else {
        	  System.out.println("Given number is not a prime");
          }

}
}

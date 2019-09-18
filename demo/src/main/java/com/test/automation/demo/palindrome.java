package com.test.automation.demo;

public class palindrome {

	public static void main(String[] args)  {

       int n=253, temp, r, sum=0;
       
       temp = n;
       while(n>0) {
    	   r = n%10;
    	   sum =(sum*10)+r;
    	   n = n/10;
       }
         if(temp==sum)
        	 System.out.println("Given number is palindrom");
         else
        	 System.out.println("Given number is not a palindrom");
       
	
	}
}

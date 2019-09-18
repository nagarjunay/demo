package com.test.automation.demo;

public class palindrome {

	public static void main(String[] args)  {

       int num=253, temp, r, sum=0;
       
       temp=num;
       while(num>0) {
    	   r=num%10;
    	   sum=(sum*10)+r;
    	   num=num/10;
       }
         if(temp==sum)
        	 System.out.println("Given number is palindrom");
         else
        	 System.out.println("Given number is not a palindrom");
       
	
	}
}

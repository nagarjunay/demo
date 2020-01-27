package com.test.automation.demo;

public class evenOdd {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("Even Numbers from 1 to "+ n +" are: ");
		for (int i = 1; i <= n; i++) 
		{
		   //if number%2 != 0 it means its an odd number
		   if (i % 2 != 0) 
		   {
			System.out.println("_");
		   }
		    else
		    {
	    	 	for(int j=1; j<=i-1; j++)
			    {
			    	System.out.print(" ");
			    }
	    	 	System.out.print("|");
		    }  
		}  
	}
}

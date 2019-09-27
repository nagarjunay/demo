package com.test.automation.demo;

public class exception {

		 static void A() 
		    { 
		        try { 
		            System.out.println("inside A"); 
		            throw new RuntimeException("demo"); 
		        } 
		        finally
		        { 
		            System.out.println("A's finally"); 
		        } 
		    } 
		  
		    // This method also calls finally. This method 
		    // will be called outside try-catch. 
		    static void B() 
		    { 
		        try { 
		            System.out.println("inside B"); 
		            return; 
		        } 
		        finally
		        { 
		            System.out.println("B's finally"); 
		        } 
		    } 
		  
		    public static void main(String args[]) 
		    { 
		        try { 
		            A(); 
		        } 
		        catch (Exception e) { 
		            System.out.println("Exception caught"); 
		        } 
		        B(); 
		    } 
	}



package com.test.automation.demo;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("How many rows you want to print?");
		int rows=scan.nextInt();
		

     for(int i=1; i<=rows; i++) {
    	 System.out.println(" ");
    	 for(int j=1; j<=i; j++) {
    		 System.out.print(i+ " ");
    	 }
     }
		System.out.println("");
//------------------------------------------------------------------------------		
		
		for(int i=1; i<=rows; i++) {
			System.out.println(" ");
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
		}
		System.out.println("");	
//------------------------------------------------------------------------------	
		
		for(int i=1; i<=rows; i++) {
			System.out.println(" ");
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("");
//------------------------------------------------------------------------------			
		
		for(int i=1; i<=rows; i++) {
			int no=i;
			for(int j=1; j<=i; j++) {
				System.out.print(no+" ");
			     no=no+rows-j;
			}
			System.out.println();
		}
		

	}
}

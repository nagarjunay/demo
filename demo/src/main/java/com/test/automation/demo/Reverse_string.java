package com.test.automation.demo;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello World";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
	}

}

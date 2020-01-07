package com.test.automation.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class duplicateElements {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		int a[] = {10, 60,10,20,20,30,40,50,60,50,60};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			if(set.add(a[i])== true) {
				st.add(a[i]);
				
			}
		}
		System.out.println(st);

	}
}

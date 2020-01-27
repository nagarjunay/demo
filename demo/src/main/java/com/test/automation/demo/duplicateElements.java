package com.test.automation.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class duplicateElements {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		int[] a = { 10, 10, 10, 20, 40, 40, 50, 50, 60, 60, 60 };
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i]) == true) {
				st.add(a[i]);
			}
		}
		System.out.println(st);
	}
}

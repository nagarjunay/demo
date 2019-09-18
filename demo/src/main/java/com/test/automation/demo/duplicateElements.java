package com.test.automation.demo;

import java.util.HashSet;
import java.util.Stack;

public class duplicateElements {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		int[] a = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9 };
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i]) == true) {
				st.push(a[i]);
			}
		}
		System.out.println(st);
	}
}

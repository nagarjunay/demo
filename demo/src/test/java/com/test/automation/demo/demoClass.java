package com.test.automation.demo;

public class demoClass implements demoInterfaceone, demoInterface, demoInterfacetwo {

	public void print1() {
		System.out.println("Hello India");
	}
	
	public void print() {
		System.out.println("Hello World");
	}

	public void print2() {
		System.out.println("Hello America");
	}

	public static void main(String[] args) {
		demoClass dc = new demoClass();
		dc.print();
		dc.print1();
		dc.print2();
	}

	
	
}

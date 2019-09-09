package com.test.automation.demo;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Constructorwithinconstructor {
	Constructorwithinconstructor(){
		this(5,6);
	}
	Constructorwithinconstructor(int x,int y){
		System.out.println("x is "+ (x+y));
	}

	public static void main(String[] args) {
		//Constructorwithinconstructor c= new Constructorwithinconstructor();	
		demochild dc = new demochild();
	}

}

class demo{
	
	demo(){
		System.out.println("Calling default demo construtor");
	}
	demo(int x){
		System.out.println("Calling paramaterized demo construtor "+x);
	}
	
	public void display() {
		System.out.println("Calling display method");
	}
}
class demochild extends demo{
	demochild(){
		display();
		
		
	}
	
	
}
package com.lti.demos;

public class TestCalculator {
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int r=c.addNos(100,200);
		System.out.println("addition is:"+r);
	    int x=c.subNos(500, 200);
	    System.out.println("substractrion is:"+x);
	}
	

}

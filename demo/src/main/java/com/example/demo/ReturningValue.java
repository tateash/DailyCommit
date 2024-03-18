package com.example.demo;

public class ReturningValue {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		// assign values to  instance variables
		r1.width = 10;
		r1.height = 20;
		int val =r1.totalArea();
		
		r2.width = 5;
		r2.height = 10;
		
		// display area of r1
		System.out.println("area of rectangle is " +val);
		
		// display area of r2
		 val =r2.totalArea();
		System.out.println("area of rectangle is " + val);
		
		System.out.println(r1.totalArea());
		// new chan

	}

}

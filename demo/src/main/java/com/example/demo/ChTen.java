package com.example.demo;
//Create a program to calculate Perimeter of a rectangle. 
//Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

public class ChTen {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 4 sides of rectangle ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		double d4 = sc.nextDouble();
	    double result = d1+d2+d3+d4;
	    System.out.println("Perimer of rectangle is : " +result);
	}

}

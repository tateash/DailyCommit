package com.example.demo;

import java.util.Scanner;

//Create a program to calculate product of two floating points numbers.
public class ChNine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any two decimal number");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();

		System.out.println("Product of your decimal number is : " + d1 * d2);
	}

}

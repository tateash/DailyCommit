package com.example.demo;

import java.util.Scanner;

//Create a program to add two numbers.
public class ChSix {

	public static void add(int a, int b) {
          
		int sum =a+b;
		System.out.println("Sum of given no ="+ sum );

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first no\n");
		int a = sc.nextInt();
		System.out.println("Please Enter the second no\n");
		int b = sc.nextInt();
		add(a, b);

	}

}

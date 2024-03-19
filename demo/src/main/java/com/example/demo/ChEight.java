package com.example.demo;

import java.util.Scanner;

//Create a program that takes two numbers and shows result of all arithmetic operators
//(+,-,*,/,%).

public class ChEight {

	public static void calculator(int a , int b )
	{
		System.out.println("Addition of given number = " +(a+b));
		System.out.println("Substraction of given number = " +(a-b));
		System.out.println("Multiplication of given number = " +(a*b));
		System.out.println("division of given number = " +(a/b));
		System.out.println("Mod of given number = " +(a%b));
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter num1 & num2 ");
		int a= sc.nextInt();
		int b = sc.nextInt();
		calculator(a,b);
		
	}

}

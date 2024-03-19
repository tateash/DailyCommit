package com.example.demo;

import java.util.Scanner;

//Create a program to calculate simple interest.
//Simple Interest = (P x T x R)/100 
public class ChTwelve {

	public static void cal(double principal, double rate, double time) {
		double interest = (principal * time * rate) / 100;
		System.out.println("Simple Interest: " + interest);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the principal: ");
		double principal = input.nextDouble();

		System.out.print("Enter the rate: ");
		double rate = input.nextDouble();

		System.out.print("Enter the time: ");
		double time = input.nextDouble();

		System.out.println("Principal: " + principal);
		System.out.println("Interest Rate: " + rate);
		System.out.println("Time Duration: " + time);
		cal(principal, rate, time);

	}

}

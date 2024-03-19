package com.example.demo;

import java.util.Scanner;
//Create a program to input name of the person and respond with ”Welcome NAME to KG Coding”

public class ChFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = sc.nextLine();
		System.out.println("Welcome " + name + " to KG coding !");

	}

}

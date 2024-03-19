package com.example.demo;
//Create a program to calculate the Area of a Triangle. 

//Area of triangle = ½*B*H

import java.util.Scanner;

public class ChEleven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter height and base of triangle ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double result = (d1*d2)/2;
		System.out.println("Area of tringle is : " + result);
	}

}

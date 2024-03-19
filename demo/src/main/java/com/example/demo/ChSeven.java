package com.example.demo;

import java.util.Scanner;

public class ChSeven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int temp,a,b;
		a=10; b=20;
		System.out.println("Before swap : a = " +a + " b =" +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap : a = " +a + " b =" +b);
		int n1, n2;
		System.out.println("Please enter first number");
		n1=sc.nextInt();
		System.out.println("Please enter second number");
		n2= sc.nextInt();
		System.out.println("Before swapping:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
		
		n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After swapping:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

	}

}

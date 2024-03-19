package com.example.demo;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box myBox = new Box();   /* here we create object of type Box using new keyword
		 myBox is ref variable which ref to object Box which is created in 
		     heap memory Box() is a default conctructor of class Box*/
		myBox.height=10;
		myBox.lenth =12.33 ;
		myBox.width =15.12354847651321;   // assigning values to instance var by using myBox ref
		
		double vol;
		vol = myBox.height * myBox.lenth * myBox.width ;
		System.out.println(" height = " + myBox.height + "length = " + myBox.lenth + " width =" +myBox.width);

		System.out.println(" Volume of box is = " +vol);

	}

}

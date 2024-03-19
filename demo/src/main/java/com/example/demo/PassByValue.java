package com.example.demo;

class Demo{
	
	void cal(int i, int j) {
		i *= 2;
		j /= 2;
		System.out.println( i + " " + j); // scope of var i & j is only for this method 
		}
}

public class PassByValue {

	public static void main(String args[]) {
		Demo ob = new Demo();
		int a = 15, b = 20;
		System.out.println("a and b before call: " +
		a + " " + b);
		
		ob.cal(a, b);   
		System.out.println("a and b after call: " +
		a + " " + b);  // here code prints value of a & b in this main method only not in cal
}
}

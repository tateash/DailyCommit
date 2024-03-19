package com.example.demo;

public class ObjRef {

	public static void main(String[] args) {
	
		Box b1 = new Box();
		Box b2 = b1 ;
		
		/* here both are pointing to the same object Box When you assign one object 
		 * reference variable to another object reference variable,
		you are not creating a copy of the object, you are only making a copy of the
		 reference. */
		
		b1.height =10 ;
		b1.lenth =20 ;
		b1.width =10 ;
		System.out.println("Values for b1 " + b1.height +" " + b1.lenth + " " + b1.width );
		System.out.println("Values for b2 " + b2.height +" " + b2.lenth + " " + b2.width );	
	
	// if you made changes through b2 it will on b1 but both are same obj 
		
		b2.height = 5;
		System.out.println("b1 height = " + b1.height);
		System.out.println("b2 height = " + b2.height);
	
	}

}

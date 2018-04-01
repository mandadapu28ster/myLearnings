package com.rao.java.core.constructor;

import coreJava.classMethods.*;

public class ConstructorExample {

	public static void main(String[] args) {
		// without constructor
		Rectangle rect1= new Rectangle();
		rect1.getData(10,2);
		System.out.println(rect1.area());
		
		//with constructor
		RectangleConstructor rect2=new RectangleConstructor(5,2);
		System.out.println(rect2.area());
		
		//with constructor overloading
		rect2=new RectangleConstructor(2);
		System.out.println(rect2.area());

	}

}

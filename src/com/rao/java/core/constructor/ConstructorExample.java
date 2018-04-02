package com.rao.java.core.constructor;

import com.rao.java.core.classMethods.*;

public class ConstructorExample {

	public static void main(String[] args) {
		// without constructor
        Triangle rect1= new Triangle();
		rect1.setData(10,2);
		System.out.println(rect1.area());
		
		//with constructor
		RectangleConstructor rect2=new RectangleConstructor(5,2);
		System.out.println(rect2.area());
		
		//with constructor overloading
		rect2=new RectangleConstructor(2);
		System.out.println(rect2.area());

	}

}

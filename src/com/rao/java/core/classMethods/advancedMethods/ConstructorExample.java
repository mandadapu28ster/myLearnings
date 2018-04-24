package com.rao.java.core.classMethods.advancedMethods;

import com.rao.java.core.classMethods.*;

public class ConstructorExample {

	public static void main(String[] args) {
		// without advancedMethods
        Triangle rect1= new Triangle();
		rect1.setData(10,2);
		System.out.println(rect1.area());
		
		//with advancedMethods
		RectangleConstructor rect2=new RectangleConstructor(5,2);
		System.out.println(rect2.area());
		
		//with advancedMethods overloading
		rect2=new RectangleConstructor(2);
		System.out.println(rect2.area());

	}

}

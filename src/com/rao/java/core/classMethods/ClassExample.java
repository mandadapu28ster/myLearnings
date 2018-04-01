package com.rao.java.core.classMethods;

import java.io.IOException;

public class ClassExample {

	public static void main(String[] args) throws IOException {
		
		Triangle rect1= new Triangle();
		
		rect1.setData(2,6);
		double a=rect1.area();
		System.out.println("Accute angle triangle Area ==> "+a);
		
		//rect1.leanth=rect1.base=20;									//class variable data setup via object
		//System.out.println("Isosles Triangle Area ===>  "+rect1.area());
		
		//Triangle.leanth=Triangle.base=20;								//public class variables data setup
		//System.out.println("Isosles Triangle Area ===>  "+rect1.area());
		
	}

}

package com.rao.java.core.classMethods;

public class MethodUsageExample {

	public static void main(String[] args) {
		
		//declaring/instantiating object 
		Triangle rect1= new Triangle();												//default constructor;method 6
		
		rect1.setData(2,6);												//method1
		double a=rect1.area();
		System.out.println("Accute angle triangle Area ==> "+a);
				
		rect1.setData(8);														//method2
		System.out.println("Isosles Triangle Area ===>  "+rect1.area());
		
		rect1.setData(4,3);												//method1, but with out double variable like first.
		System.out.println("Rectangle Area ===>  "+rect1.area());

		Triangle rect2= new Triangle(8);										//Constructor example method 5
		System.out.println("Isosles Triangle Area ===>  "+rect2.area());

		Triangle rect3= new Triangle(4,3);								//Constructor example method 4
		System.out.println("Rectangle Area ===>  "+rect3.area());
	}

}

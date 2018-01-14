package coreJava.classMethods;

public class MethodOverloadingexample {

	public static void main(String[] args) {
		
		//declaring/instantiating object 
		Triangle rect1= new Triangle();
		
		rect1.setData(2,6);													//method1
		double a=rect1.area();
		System.out.println("Accute angle triangle Area ==> "+a);
				
		rect1.setData(8);													//method2
		System.out.println("Isosles Triangle Area ===>  "+rect1.area());
		
		rect1.setData(4,3);													//method1
		System.out.println("Rectangle Area ===>  "+rect1.area());
	}

}

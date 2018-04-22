package com.rao.java.core.classMethods;

/**
 * how to create a class and methods and its calling convention in examples
 */

/**
 * public declaration is used because of ConstructorExample code
 */


public class Triangle{
	
	//Declaring variables and initialising values
	public double height,base;
	public static double Const=0.5;
	
	public void setData(int x,int y)									//method1,which take 2 arguments
	{
        height=x;
	    base=y;
	}
	
	public void setData(int x)										//method2,which take one argument
	{
        height=base=x;
	}
	
	public double area()												//method3, which don't take any arguments;method with out parameters
    {
	    return(Const*height*base);
	}

    /**
     * Constructors def
     * @param x
     * @param y
     */
	Triangle(double x,double y){                                //Method 4
        System.out.println("Constructor called");
	    height=x;
	    base=y;
    }

    Triangle(double x){                                         //Method 5
        System.out.println("Constructor called");
        height=base=x;
    }

    Triangle(){                                                 //Method 6;default constructor, to avoid any mismatch with existing definitions of class
        System.out.println("Constructor called");
	    height=base=0;
    }
}
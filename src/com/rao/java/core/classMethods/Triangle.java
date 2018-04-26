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
     * defining Constructors
     * @param x
     * @param y
     */
	Triangle(double x,double y){                                    //Method 4;
        System.out.println("Constructor called");
	    height=x;
	    base=y;
    }

    Triangle(double x){                                         //Method 5; advancedMethods method overwriting
        System.out.println("Constructor called");
        height=base=x;
    }

    public Triangle(){                                                 //Method 6;default advancedMethods, to avoid any mismatch with existing definitions of class
        System.out.println("Constructor called");                       //Make it public to be used in other packages.
	    height=base=0;
    }

    Triangle(Triangle triangle){                                         //Method 7; advancedMethods method overwriting to copy an object
        System.out.println("Constructor called");
        height=triangle.height;
        base=triangle.base;
    }

    protected void finalize( ) {                        //Please identify final key word also
        // finalization code here;before garbage collection this method will execute
        //We don't have any controll when finalize method executes

        final int OPEN = 1;                             //its coding convention to use all upper case for final
        final int CLOSE = 2;                            //defining constant values

        System.out.println("Garbage collection performed.");
    }
}
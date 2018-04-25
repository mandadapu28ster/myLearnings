package com.rao.java.core.classMethods.advancedMethods;

public class RectangleConstructor {
	public static int leanth, breath;
	
	//protected added for Inheritance example
	//Same expample is portrayed in triangle class in classMethods package also. this is redundant, kept for isolated advancedMethods learning

	protected RectangleConstructor(int x,int y)
	{
		leanth=x;
		breath=y;
	}
	
	//overloading
	RectangleConstructor(int x)
	{

		leanth=breath=x;
	}
	
	public static int area()
	{

		return(leanth*breath);
	}
}

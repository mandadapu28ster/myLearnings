package com.rao.java.core.constructor;

public class RectangleConstructor {
	public static int leanth, breath;
	
	//protected added for Inheritance example
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

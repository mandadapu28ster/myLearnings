package coreJava.inheritance;

import coreJava.constructor.RectangleConstructor;

public class Inheritance extends RectangleConstructor {
	
	public static int height;
	
	//sub class constructor
	Inheritance(int x,int y, int z) {
		//super method should be in first line, if needed
		super(x,y);
		height=z;
	}

	public static int volume()
	{
		return(leanth*breath*height);
	}
	
	//method over riding... to get effect comment this method run InheritanceExample.java
	public static int area()
	{
		return(breath*height);
	}
}

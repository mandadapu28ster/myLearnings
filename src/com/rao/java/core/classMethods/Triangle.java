package com.rao.java.core.classMethods;

//Learnings1
//how to create a class and methods and its calling convention in examples

//public declaration is used because of ConstructorExample code

public class Triangle{
	
	//Declaring variables and initialising values
	public double leanth,base;
	public static double Const=0.5;
	
	public void setData(int x,int y)									//method1
	{
	leanth=x;
	base=y;
	}
	
	public void setData(int x)										//method2
	{
	leanth=base=x;
	}
	
	public double area()												//method3
	{
	return(Const*leanth*base);	
	}
}
package com.rao.java.core.varArgs;

public class VariableArguments1 {
	
	static void ExampleArg(String ... person)
	{
		for(String i:person)
		{
			System.out.println("Hello "+i);
		}
	}

	public static void main(String[] args) {
		//Here we can pass any number of arguments
		ExampleArg("Ram","Lakshman","Krishna");

	}

}

package com.rao.java.core.varArgs;

//Cation with varArgs is compiler ambiguity related errors; please refer proper document and code crafting before using it

public class VariableArguments1 {
	
	static void ExampleArg(String ... person)
	{
		for(String i:person)
		{
			System.out.println("Hello "+i);
		}
	}
	static void ExampleArg(int ... number)			//varArgs method overloading; it can also overload non varArg method
	{
		for(int i:number)
		{
			System.out.println("Hello "+i);
		}
	}
	public static void main(String[] args) {
		//Here we can pass any number of arguments
		ExampleArg("Ram","Lakshman","Krishna");
		ExampleArg(1, 2, 3);
	}

}

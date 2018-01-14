package coreJava.varArgs;

public class VariableArguments2 {

	
	static void ExampleArg(String[] args)
	{
		for(String string:args)
		{
			System.out.println("Hello "+string);
		}
	}

	public static void main(String[]args) {
		ExampleArg(args);

	}
}

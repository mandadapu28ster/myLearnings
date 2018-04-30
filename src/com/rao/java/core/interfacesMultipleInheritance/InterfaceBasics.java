package com.rao.java.core.interfacesMultipleInheritance;

public class InterfaceBasics {

	public static void main(String[] args) {
		Callback c = new Client();				//variable c is interface type ; same as like super class object referring sub class object
		c.callback(42);					//we can't use c for accessing nonIfaceMeth

		Client C = new Client();
		c=C;
		((Client) c).nonIfaceMeth();			//observe the way how we are calling custom method
												//you are not allowed straight to use objet with out type conversion ?? for non interface methods
		AnotherClient ob = new AnotherClient();
		c = ob; 								// c now refers to AnotherClient object
		c.callback(42);
	}

}

/*public*/	 interface Callback {				//if we use public as access modifier we need to keep file name same as interface name
	final int CONST=0;
//	public int ijk;
//	protected int klm;
	public int abc=0;							//Variable should be declared,and carried to further as Constants; protected is not a valid use in interface
	void callback(int param);
		}


class Client implements Callback {
	// Implement Callback's interface
	int i;										//dummy variable to show implementation same as inheritance
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}

	void nonIfaceMeth() {						//while implementing interfaces, we can add custom methods and variables as inheritance
		System.out.println("Classes that implement interfaces " +
				"may also define other members, too.");
	}
}

// Another implementation of Callback.
class AnotherClient implements Callback {
	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " + (p*p));
	}
}
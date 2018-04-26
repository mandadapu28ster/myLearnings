package com.rao.java.core.inheritance;

public class AbstractClass {

	public static void main(String[] args) {
		BBC b = new BBC();
		b.callme();
		b.callmetoo();
	}

}

abstract class ABC {
	abstract void callme();

	// concrete methods are still allowed in abstract classes
	void callmetoo() {
		System.out.println("This is a concrete method. in abstract class");
	}

	/**
	 * We can define as many as concrete methods
	 * if we use final as key word in method declaration it is not allowed to modify in subclass(s)
	 * class also can define final to avoid inhere; can't use final abstract same time at class level
	 * class defined final results all the components by default make as final
	 */
	final void callMeTooAlso() {
		System.out.println("This is a concrete method. in abstract class");
	}
}
class BBC extends ABC {
	void callme() {
		System.out.println("B's implementation of callme.");
	}
//	void callMeTooAlso(){			//error:can't override, because method is final in super class
//
//	}
}
//need to write
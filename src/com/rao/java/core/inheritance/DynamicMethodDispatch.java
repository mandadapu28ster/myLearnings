package com.rao.java.core.inheritance;
/**
 * Method overriding forms the basis for one of Java’s most powerful concepts: dynamic method dispatch.
 * Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
 * it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
 * Therefore, if a superclass contains a method that is overridden by a subclass,
 * then when different types of objects are referred to through a superclass reference variable,
 * different versions of the method are executed.
 */
public class DynamicMethodDispatch {
    public static void main(String args[]) {
        AA a = new AA(); // object of type AA
        BB b = new BB(); // object of type BB
        CC c = new CC(); // object of type CC
        AA r; // obtain a reference of type AA
        r = a; // r refers to an AA object
        r.callme(); // calls AA's version of callme
        r = b; // r refers to a BB object
        r.callme(); // calls BB's version of callme
        r = c; // r refers to a CC object
        r.callme(); // calls CC's version of callme
    }
}
class AA {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}
class BB extends AA {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
class CC extends AA {
    // override callme()
    void callme() {
        System.out.println("Inside C's callme method");
    }
}
package com.rao.java.core.interfacesMultipleInheritance;

public class InterfaceAdvanced {
    public static void main(String args[]) {
        // use a nested interface reference, name is fully qualified by the enclosing class’ name
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if(nif.isNotNegative(-12))                          //if condition will be evaluated false
            System.out.println("this won't be displayed");
    }
}


abstract class Incomplete implements Callback {         // the class Incomplete does not implement callback( ) and must be declared as abstract.

    int a, b;                                           //Incomplete implementation of interface leads to abstract class

    void show() {
        System.out.println(a + " " + b);
    }

}


// A nested interface example.
// This class contains a member interface.
class A {
    // this is a nested interface
    //NestedIF is a member interface.
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}

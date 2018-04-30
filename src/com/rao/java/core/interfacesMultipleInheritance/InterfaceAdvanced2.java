package com.rao.java.core.interfacesMultipleInheritance;

//interface with inheritance

public class InterfaceAdvanced2 {
    public static void main(String arg[]) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        C.meth5();          //static method calling convention same as static method(s) in class
    }
}

interface AB {
    void meth1();
}

// BA now includes meth1() and meth2()
interface BA extends AB {
    void meth2();

    default void meth3(){                                   //Default implementation included from JDK 8 onwards
        System.out.println("Implement default meth3().");
    }
}

interface C {

    default void meth4(){                                   //Default implementation included from JDK 8 onwards
        System.out.println("Implement default meth4().");
    }

    static void meth5(){
        System.out.println("meth4() is static");
    }
}

class MyClass implements BA,C {                             //Class can implement multiple Interface, same is not allowed with Inheritance
    public void meth1() {
        System.out.println("Implement meth1().");
    }
    public void meth2() {
        System.out.println("Implement meth2().");
    }

}
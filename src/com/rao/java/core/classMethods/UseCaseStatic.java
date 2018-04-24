package com.rao.java.core.classMethods;

public class UseCaseStatic {
    static int a = 3;                                       //a initialises first
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");    //this will print first
        b = a * 4;
    }
    public static void main(String args[]) {
        meth(42);
        StaticExample.callme();                             //calling mechanisam to static methods
    }
}
class StaticExample {
    static int a = 42;                                      //there is no conflict, because of different classes
    static int b = 99;
    static void callme() {
        System.out.println("a = " + a);
    } }
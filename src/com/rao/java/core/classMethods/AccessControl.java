package com.rao.java.core.classMethods;

public class AccessControl {
    public static void main(String[] args) {

        Test abc = new Test();
        // These are OK, a and b may be accessed directly
        abc.a = 1;
        abc.b = 10;

        // This is not OK and will cause an error
        //  ob.c = 100; // Error!
        // You must access c through its methods
        abc.setc(100); // OK
        System.out.println("a, b, and c: " + abc.a + " " + abc.b + " " + abc.getc());
    }
}

class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access
    // methods to access c
    void setc(int i) { // set c's value
        c = i; }
    int getc() { // get c's value
        return c;
    }
}
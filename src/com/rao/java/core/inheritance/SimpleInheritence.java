package com.rao.java.core.inheritance;

public class SimpleInheritence {
    public static void main(String args []) {
        A superOb = new A(10,11);
        B subOb = new B(7,8);

        // The superclass may be used by itself.
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println("=====================");

        /* The subclass has access to all public members of
       its superclass. */
//        subOb.i = 7;
//        subOb.j = 8; not possible because of access modifier
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println("=====================");
        System.out.println("Sum of i and k in subOb:");
        subOb.sum();
    }
}
// Create a superclass.
class A {
    int i;
    private int j;


    public A(int x,int y){
        i=x;
        j=y;
    }
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A.
class B extends A {
    int k;
    public B(int i, int j) {
        super(i, j);
    }

    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {

        System.out.println("i+k: " + (i+k));    //you can't use j for processing
    }
}
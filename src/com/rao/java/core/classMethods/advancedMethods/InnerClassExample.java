package com.rao.java.core.classMethods.advancedMethods;

public class InnerClassExample {

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }

}
class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();              //inner class instance should be created in scope of outer only
        inner.display();
    }

    void showy() {
        //System.out.println(y);    // note it :y not known here!  error
    }

    // this is an inner class
    class Inner {
        int y = 10; // y is local to Inner
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
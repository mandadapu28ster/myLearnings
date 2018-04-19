package com.rao.java.core.basics.controlStatements;

public class While {

    public static void main(String args[]) {
        int n = 10;
        while(n > 0) {
            System.out.println("Count " + n);
            n--;
        }

        while(n > 0)
        ;//nothing will happen because of empty statement

        while(1==1)
            System.out.println("i am running ... stop me "); //infinite loop
        /**
         * Nested while loop also allowed, it is all about what we we want to achieve
         */
    }
}

package com.rao.java.core.basics.controlStatements;

public class For {
    public static void main(String args[]) {
        int n;
        for(n=10; n>0; n--)
            System.out.println("Count " + n);

        for(int N=10,M=20; N>0; N--) {
            System.out.println("Count " + N);
            if(N==5)
                break;
        }

        for(;;)
            System.out.println("I am running .. stop me "); //infinite loop

        /**
         * Nested for loop also allowed, it is all about what we we want to achieve
         * Example handling multi dimensional array, check example in EnhancedFor.java
         */
    }
}

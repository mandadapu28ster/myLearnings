package com.rao.java.core.errorsExceptions;

public class ThrowExample {
    static void demoprog() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoprog.");
            throw e;                                            // rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoprog();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

package com.rao.java.core.errorsExceptions;

class MultiCatch {
    public static void main(String args[]) {
        int a=10, b=0;
        int vals[] = { 1, 2, 3 };
        try {
            int result = a / b; // generate an ArithmeticException
            //vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
            // This catch clause catches both exceptions.
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {           //will catch both exceptions

            System.out.println("Exception caught: " + e);
        }

        System.out.println("After multi-catch.");
    }
}

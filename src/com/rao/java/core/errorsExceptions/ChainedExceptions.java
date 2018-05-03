package com.rao.java.core.errorsExceptions;

public class ChainedExceptions {
    /**
     * Throwable(Throwable causeExc)
     * Throwable(String msg, Throwable causeExc)
     *
     * In the first form, causeExc is the exception that causes the current exception.
     * That is, causeExc is the underlying reason that an exception occurred.
     * The second form allows you to specify a description at the same time that you specify a cause exception.
     * These two constructors have also been added to the Error, Exception, and RuntimeException classes.
     *
     * ex
     * Throwable getCause( )
     * Throwable initCause(Throwable causeExc)
     */
    static void demoproc() {
        // create an exception
        NullPointerException e =
                new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " +
                    e.getCause());
        }
    }
}

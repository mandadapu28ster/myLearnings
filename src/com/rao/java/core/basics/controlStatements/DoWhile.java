package com.rao.java.core.basics.controlStatements;

public class DoWhile {
    public static void main(String args[]) {
        int n = 10;
         do {
            System.out.println("Count " + n);
            //n--; we wrote efficiently by including decrement in while condition
        }while (--n > 0);

         //IMP Point:loop will run minimum once before validating while condition
        //n value is set to "0" but still below loop will execute once
        do {
            System.out.println("Count " + n);
            n--;
        }while (n > 0);
    }
}

package com.rao.java.core.basics.controlStatements;

public class If {
    public static void main(String args[]) {
        int i=0,j=0,k=0;
        int a=2,b=3,c=4,d=5;

        /**
         * If Else
         */
        if (i == 10)
            a=b;
        else
            b=c;
        System.out.println("a is "+a+"  b is "+b);

        /**
         * Nested IF
         */
        if (i == 10)
        {
            if (j < 20)
                a = b;
            if (k > 100)
                c = d;
            else
                a = c;
        }
        else
            a = d;

        System.out.println("a is "+a+"  b is "+b);

        /**
         * if-else-if Ladder
         */

        if (i >= 10)
            a=b;
        else if (j == 20)
                a = b;
        else if (k > 100)
                c = d;
        else if (i<j)
                a = c;
        else
            a=0;

        System.out.println("a is "+a+"  b is "+b);
    }
}
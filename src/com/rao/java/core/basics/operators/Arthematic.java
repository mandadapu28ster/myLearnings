package com.rao.java.core.basics.operators;

public class Arthematic {
    public static void main(String args[]){

        // arithmetic using integers an double
        System.out.println("Integer Arithmetic"+"   floating Point Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;

        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("a = " + a+"                 da = " + da);
        System.out.println("b = " + b+"                 db = " + db);
        System.out.println("c = " + c+"                 dc = " + dc);
        System.out.println("d = " + d+"                dd = " + dd);
        System.out.println("e = " + e+"                 de = " + de);

        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        /**
         * compound asgined and increment & decrement
         */
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a +=5 is  " + a);
        System.out.println("b *=4 is  " + b);
        System.out.println("c %=6 is  " + c);

        a++;
        b--;
        c=++b;
        System.out.println("a++ is    " + a);
        System.out.println("b-- is    " + b);
        System.out.println("c=++b is  " + c);

    }
}

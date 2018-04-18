package com.rao.java.core.basics.operators;

public class BitWiseoperators {

    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b)|(a & ~b);
        int g = ~a & 0x0f;

        System.out.println("        a   = " + binary[a]);
        System.out.println("        b   = " + binary[b]);
        System.out.println("        a|b = " + binary[c]);
        System.out.println("        a&b = " + binary[d]);
        System.out.println("        a^b = " + binary[e]);
        System.out.println("~a&b|a&~b   = " + binary[f]);
        System.out.println("       ~a   = " + binary[g]);

        /**
        * Compound operators also will work with above bit wise operators
        */


        /**
        * Left shift
        */
        byte A = 64, B;
        int I;
        I = A<< 2;
        B= (byte) (A << 2);
        System.out.println("Original value of A: " + A);
        System.out.println("int I ====>left shift A:"+ I + "\nand byte B left shift A: " + B);

        /**
         * Effect of left/rght shift
         */
        int i;
        int num = 0xFFFFFFE;
        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println("After left shift ==> "+num);
        }

        for(i=0; i<4; i++) {
            num = num >> 1;
            System.out.println("After right shift ==> "+num);
        }

        for(i=0; i<4; i++) {
            num = num >>> 1;
            System.out.println("After Un-sighned right shift ==> "+num);
        }

    }
}

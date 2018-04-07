package com.rao.java.core.basics.casting;

public class AutomaticPramotion {
public static void main(String[] args){

    byte A = 40;
    byte B = 50;
    byte C = 100;
    /**
     * A * B promoted to int
     */
    int D = A * B / C;

    /**
     * Error! Cannot assign an int to a byte!
     * because B*2 promoted into int so need to cast as byte
     * note down B*2 value which is 100 still limit of byte
     */
    B = (byte) (B * 2);

    /**
     * Type promotion rules
     * First, all byte, short, and char values are promoted to int, as just described. Then,
     * if one operand is a long, the whole expression is promoted to long.
     * If one operand is a float, the entire expression is promoted to float.
     * If any of the operands are double, the result is double.
     */

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result = (f * b) + (i / c) - (d * s);
    System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
    System.out.println("result = " + result);
}
}

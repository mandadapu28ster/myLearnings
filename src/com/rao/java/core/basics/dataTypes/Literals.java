package com.rao.java.core.basics.dataTypes;

public class Literals {
    public static void main(String args[]){

        /**
         * assigning binary literal to int supported @level5
         */

        int x = 0b1010;
        System.out.println("int x assgined as binary " + x);

        x= 123_456_789;
        System.out.println("int x assgined as readable " + x);

        x = 0b1101_0101_0001_1010;
        System.out.println("int x assgined as readable binary " + x);

        /**
         * assigning hexadecimal (base 16) will follow 0x or 0X
         */

        long y=0x7ffffffffffffffL;
        System.out.println("long y assgined as hexa " + y);

        /**
         * assigning octa (base 8) will follow 0
         */
        y=0745L;
        System.out.println("long y assgined as octa " + y);

        /**
         * assigning exponents decimal hexa ;same will follow for remaining
         */
        double z=45.6E3;
        System.out.println("double z assgined with decimal fraction " + z);

        z= 0x12.2P2;
        System.out.println("double z assgined with hexa fraction " + z);

    }
}

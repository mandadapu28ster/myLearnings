package com.rao.java.core.basics.casting;

public class AutomaticConversion {

    public static void main (String args[]){
        /*
        Integer group: byte,short,int and long
         */
        byte abc; // holds 8-bit numbers 2e8 is nothing but range -128 to 127
        short def; // holds 16-bit numbers 2e16 is nothing but range –32,768 to 32,767
        int ghi; // holds 32-bit numbers 2e32 is nothing but range –2,147,483,648 to 2,147,483,647
        long jkl; // holds 64-bit numbers 2e64 is nothing but range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        /*
        floating numbers group float and doable
         */
        float mno; // holds 32-bit numbers 2e32 is nothing but range –2,147,483,648 to 2,147,483,647
        double pqr; // holds 64-bit numbers 2e64 is nothing but range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        char stu; // holds 16-bit numbers to give coverage for Unicode (http://www.unicode.org.)
        boolean vwx; //Java reserves one byte for a boolean datatype, but it uses only one bit. Clearly, it is virtual machine dependent. try booleanMagic class


    }
}

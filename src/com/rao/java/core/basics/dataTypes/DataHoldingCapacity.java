package com.rao.java.core.basics.dataTypes;

/**
 * This class explains arthematic multiplication operation and holding capacity for different variable declarations.
 */

public class DataHoldingCapacity {
    public static void main(String args[]) {
        /**
         Integer group: byte,short,int and long
         */

        byte abc=23; // holds 8-bit numbers 2e8 is nothing but range -128 to 127
        short def=23230; // holds 16-bit numbers 2e16 is nothing but range –32,768 to 32,767
        int ghi = 230000; // holds 32-bit numbers 2e32 is nothing but range –2,147,483,648 to 2,147,483,647
        long jkl = 230000000; // holds 64-bit numbers 2e64 is nothing but range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        /**
         Floating numbers group float and doable
         */
        float mno = 23.23f; // holds 32-bit numbers 2e32 is nothing but range –2,147,483,648 to 2,147,483,647
        double pqr = 23000.23; // holds 64-bit numbers 2e64 is nothing but range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


        /**
         * Operation proves byte declaration capability to hold the numbers
         */
        byte vwx= (byte) (abc*abc);

        /**
         * Operation proves short declaration capability to hold the numbers
         */
        short xwv= (short) (abc*abc);

        short xwv1= (short) (def*def);

        /**
         * Operation proves int declaration capability to hold the numbers
         */
        int GHI= def*def;

        int GHI1= ghi*ghi;

        /**
         * Operation proves long declaration capability to hold the numbers
         */
        long JKL= ghi*ghi;

        long JKL1= jkl*jkl;

        /**
         * Operation proves double declaration capability to hold the scientific numbers
         */
        double GHI2=2.3e5;
        double JKL2= GHI2*GHI2;

        double JKL3=2.3e8;
        double JKL4= JKL3*JKL3;

        /**
         * Operation proves float/double declaration capability to hold the scientific numbers and truncation with type casting
         */
        float MNO=mno*mno;
        double onm=2.323e1;
        double MNO1=onm*onm;
        double OMN=mno*mno;

        double PQR=pqr*pqr;
        pqr=23.00023e3;
        double PQR1=pqr*pqr;

        System.out.println("Below is actual     VS                    expected");
        System.out.println("byte operation ==>  "+vwx+"         expected with short is ===> "+xwv);
        System.out.println("short operation ==> "+xwv1+"        expected with int is ===>   "+GHI);
        System.out.println("int operation ==>   "+GHI1+"        with long ===>"+JKL+" but expected is (as double scientific)===>     "+JKL2);
        System.out.println("long operation ==>  "+JKL1+"        expected as with double operation is ===>"+JKL4);
        System.out.println("float operation ==> "+MNO+"         expected with scientific double is "+MNO1+" with double auto casting    "+OMN);
        System.out.println("double operation ==>  "+PQR+"       expected with double scintific operation is ===>"+PQR1);
    }
}

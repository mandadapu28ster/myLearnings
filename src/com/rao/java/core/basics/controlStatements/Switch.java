package com.rao.java.core.basics.controlStatements;

public class Switch {
    public static void main(String args[]) {

        for(int i=0; i<6; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }


        //JDK 7 above support string in switch
        //break is optional

        String str = "one";
        switch(str) {
            case "one":
                System.out.println("one");
            case "two":
                System.out.println("two");
                break;
        }

        //Nested switch
        for(int i=0; i<2; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    switch(str) {
                        case "one":
                            System.out.println("one");
                            break;
                        case "two":
                            System.out.println("two");
                            break;
                    }
                    //this break is not required
                    //break;
                case 2:
                    System.out.println("i is two.");
            }

    }
}

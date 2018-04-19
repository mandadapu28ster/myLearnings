package com.rao.java.core.basics.controlStatements;

public class JumpConditions {

    public static void main(String args[]) {

        //plain break usage
        for (int N = 10, M = 20; N > 0; N--) {
            System.out.println("Count " + N);
            if (N == 5)
                break;
        }


        System.out.println("==================================");

        //break with style of goto specific loop exit
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }



        System.out.println("==================================");

        //Continue
        //loop continue if it is even and print number in same line,if is not even print and go to next line and execute loop further
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }


        System.out.println("==================================");


        //continue with style of goto specific loop exit
        outer: for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();


        System.out.println("==================================");

        //return is special kind of control/jump statement ; will utilise and learn more about it in method retuning values
        //below code snippet causes program control to transfer back to the caller of the method.
        boolean T = true;
        System.out.println("Before the return.");
        if(T) return; // return to caller
        System.out.println("This won't execute.");
    }
}

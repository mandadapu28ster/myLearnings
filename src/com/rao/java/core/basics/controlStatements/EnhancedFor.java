package com.rao.java.core.basics.controlStatements;

public class EnhancedFor {
    public static void main(String args[]) {
        int n[] = {10, 20};
        for (int N : n)
            System.out.println("Count " + N);


        for (int N : n) {
            System.out.println("Count " + N);
            if(N == 10)
                break; // stop the loop when 10 is obtained
        }

        /**
         * Logic is strait forward, array elements will be assigned to variable N each time till completing the array,
         */

        /**
         * Multi-dymantional array handling
         */

        int sum = 0;
        int nums[][] = new int[3][5];
        // give nums some values
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // use for-each for to display and sum the values
        for(int x[] : nums)
        {
            for(int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);

    }
}

/*
Find the smallest Kth element in unsorted array
A=[1,5,8,2,4,0,1,3] 3rd

ans: 2
1st small=0, 2nd 1, 3rd smallest = 2

A=[0,1,0,0,1,1,0] 3rd
ans = null ; if no Kth smallest return null

1st small = 0, 2nd smallest =1, 3rd no other element
 */
package com.rao.java.interviews;

import java.util.*;

public class JPMorganFirst {
    public static void main(String args[]) {
        int A[] = {1, 5, 8, 2, 4, 0, 1, 3};
        Arrays.sort(A);
        System.out.println(kthSmallestWithArray(A, 3));

        int[] B = {0, 1, 0, 0, 1, 1, 0};
        Arrays.sort(B);
        System.out.println(kthSmallestWithArray(B, 6));

    }

    private static Integer kthSmallestWithArray(int[] A, int k) {

        List<Integer> b = new ArrayList();
        b.add(A[0]);

        for (int i = 1; i < A.length; i++) {
            int ch = A[i];
            if (ch != A[i - 1]) {
                b.add(A[i]);
            }//if
        }//for
        try {
            return b.get(k - 1);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }

    }

}

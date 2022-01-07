/*
 * A string is provided which consist of integer
 * insert * if subsequent integers are even
 * and insert - if subsequent integers are odd
 * EX: 21462675756 converted to 214*6*2*67-5-7-56
 * ex: 98676555533 converted to 98*6765-5-5-5-3-3
 * */
package com.rao.java.interviews;

public class JPMorganSecond {
    public static void main(String args[]) {
        String a = "21462675756";
        System.out.println(stringManuplater(a));
        String b = "98676555533";
        System.out.println(stringManuplater(b));
    }

    private static String stringManuplater(String manuplate) {
        String manipulated = String.valueOf(manuplate.charAt(0));

        for (int i = 1; i < manuplate.length(); i++) {
            if ((manipulated.charAt(manipulated.length() - 1) % 2 == 0) && (manuplate.charAt(i) % 2 == 0)) {
                manipulated = manipulated + "*" + manuplate.charAt(i);
            } else if ((manipulated.charAt(manipulated.length() - 1) % 2 != 0) && (manuplate.charAt(i) % 2 != 0)) {
                manipulated = manipulated + "-" + manuplate.charAt(i);
            } else {
                manipulated = manipulated + String.valueOf(manuplate.charAt(i));
            }
        }
        return manipulated;
    }
}

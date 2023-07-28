package org.example.branching;

/*
Find max{min(a,b), min(c,d)}
 */

public class MaximumFunction {
    public static void main(String[] args) {
        System.out.println(usingMathMethod(100,90,110,125));
        System.out.println(usingIfMethod(100, 90, 110, 125));
    }

    public static int usingMathMethod(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    public static int usingIfMethod(int a, int b, int c, int d) {
        int min1, min2;
        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }

        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }

        if (min1 > min2) {
            return min1;
        } else {
            return min2;
        }
    }



}

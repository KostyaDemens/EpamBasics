package org.example.cycles;

import java.math.BigInteger;

/*
Find sum of squares of first 100 numbers

***Find the multiplication of squares of first 200 numbers
 */

public class SumOfSquares {
    public static void main(String[] args) {

    }

    private static void multiplicOfSquares() {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }

    private static void sumOfSquares() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += (int)Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}

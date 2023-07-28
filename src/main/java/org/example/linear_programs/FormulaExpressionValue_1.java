package org.example.linear_programs;

/*
Find formula expression Value ((b + √b^2 + 4 * a * c) / (2 * a)) - a^3 * c + b^-2
 */

public class FormulaExpressionValue_1 {
    public static void main(String[] args) {
        System.out.println(expValue(1, 3, 4));
    }

    public static double expValue(float a, float b, float c) {
        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return z;
    }
}

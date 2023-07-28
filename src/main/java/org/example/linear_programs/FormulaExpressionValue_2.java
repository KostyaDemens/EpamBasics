package org.example.linear_programs;

/*
Find formula expression Value ((sin x + cos y) / (cos x - sin y)) * tg(xy)
 */

public class FormulaExpressionValue_2 {
    public static void main(String[] args) {
        System.out.println(expValue(2, 3));
    }

    public static double expValue(double x, double y) {
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        return z;
    }
}

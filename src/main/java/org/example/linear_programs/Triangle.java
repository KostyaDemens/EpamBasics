package org.example.linear_programs;

/*
Given two angles of a triangle. Does it exist? And will it be triangular?
 */

public class Triangle {
    public static void main(String[] args) {
        System.out.println(isItReal(45, 45));
    }

    public static boolean isItReal(double a, double b) {
        if (((a + b) < 180 && (a + b)!= 90) && (a != 0) && (b != 0)) {
            return true;
        } else if ((a + b == 90) && (a != 0) && (b != 0)){
            System.out.println("This triangle is triangular!");
            return true;
        } else {
            return false;
        }
    }
}

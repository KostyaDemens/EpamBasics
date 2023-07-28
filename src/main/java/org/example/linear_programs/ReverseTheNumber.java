package org.example.linear_programs;

/*
Given a number of the form nnn.ddd. Swap the fractional and integer parts of a number
 */

public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(123.456));
    }

    public static double reverseNum(double num) {
        return (num * 1000) % 1000 + (int) num / 1000.0;
    }
}

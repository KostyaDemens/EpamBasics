package org.example.linear_programs;

/*
Find function value z = ((a - 3) * b / 2) + c
 */

public class FunctionValue {
    public static void main(String[] args) {
        System.out.println(function(2, 3, 4));
    }
    public static float function(float a, float b, float c) {
        float z = ((a - 3) * b / 2) + c;
        return z;
    }
}

/*
Add tests to given code in future
*/

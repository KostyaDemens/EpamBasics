package org.example.linear_programs;

/*
Given a natural number. Convert it to hours minutes and seconds
 */

public class NumberIntoTime {
    public static void main(String[] args) {
        System.out.println(numIntoTime(3689));
    }

    public static String numIntoTime(int secs) {
        int hours = secs / 3600;
        int min = secs / 60 % 60;
        int sec = secs / 1 % 60;
        return String.format("%02d:%02d:%02d", hours, min, sec);

    }
}

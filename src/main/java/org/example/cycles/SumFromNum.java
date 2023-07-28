package org.example.cycles;

/*
Write a program where user enters a number and the program adds up all the numbers from one to that number
 */

import java.util.Scanner;

public class SumFromNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

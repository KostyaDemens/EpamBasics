package org.example.testing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sliceArray(new int[]{1,2,3,4,5,6})));
        System.out.println(Arrays.toString(sliceArray(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(sliceArray(new int[]{4})));
    }

    public static int[] sliceArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("4 not found");
    }
}

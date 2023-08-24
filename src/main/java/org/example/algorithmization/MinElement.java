package org.example.algorithmization;

public class MinElement {
    public static void main(String[] args) {
//        withForLoops();
        withoutForLoops(new int[]{1, 5, 6, 7, 3, 2, 1, 0});
    }

    private static void withForLoops() {
        int[] array = {3, 2, 1, 7, 8, 4, 3, 2};
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = array[j];
                }
            }
        }
        System.out.println(min);
    }

    public static void withoutForLoops(int[] array) {
        int min = 0;
        for (int k : array) {
            for (int j : array) {
                if (k > j) {
                    min = j;
                }
            }
        }
        System.out.println(min);
    }
}

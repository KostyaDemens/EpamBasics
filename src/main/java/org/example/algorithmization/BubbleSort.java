package org.example.algorithmization;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 2, 6, 7, 2, 1, 5, 7};
        System.out.println(Arrays.toString(array));
        boolean needIter = true;
        while (needIter) {
            needIter = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIter = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
    /*
    Сортировка пузырьком - одна из самых простых и неэффективных сортировок. Её еще иногда называют "глупой сортировкой"
    */

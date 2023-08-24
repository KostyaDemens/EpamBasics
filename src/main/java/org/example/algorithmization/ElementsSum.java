package org.example.algorithmization;

public class ElementsSum {
    public static void main(String[] args) {
        int k = 2; //Найти сумму чисел, кратных k
        int sum = 0;
        int[] array = new int[]{2, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

}

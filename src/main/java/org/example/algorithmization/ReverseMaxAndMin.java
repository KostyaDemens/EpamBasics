package org.example.algorithmization;


public class ReverseMaxAndMin {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Дань массив с количеством элементов n. Выбрасить каждый второй элемент (на его место поставить 0)
        int placeHolder = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = placeHolder;
            }
            System.out.println(array[i]);
        }
    }
}

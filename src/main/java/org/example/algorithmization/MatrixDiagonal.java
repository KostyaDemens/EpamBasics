package org.example.algorithmization;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}

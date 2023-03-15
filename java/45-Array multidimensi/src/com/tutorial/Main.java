package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //assign array 2d
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 3, 2, 1}
        };

        printArr(arr);

        //declare array
        int[][] arr1 = new int[4][4];

        System.out.println();
        printArr(arr1);

        //deepToString
        System.out.println();
        System.out.println("deepToString");
        System.out.println(Arrays.deepToString(arr));


        //for each
        System.out.println();
        System.out.println("for each");
        for (int[] row : arr) {
            for (int n : row) {
                System.out.print(n + ", ");
            }
            System.out.println();
        }
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("]");
        }
    }
}

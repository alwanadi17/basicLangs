package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2},
                {3,4}
        };

        int[][] arr2 = {
                {11,12},
                {13,14}
        };

        System.out.println("Array 1: ");
        printArr(arr1);
        System.out.println("Array 2: ");
        printArr(arr2);
        System.out.println();
        System.out.println("Penjumlahan Array: ");
        printArr(jumlah(arr1,arr2));

        System.out.println("Perkalian Array: ");
        printArr(kali(arr1,arr2));
    }

    private static void printArr(int[][] arr) {
        for (int[] tmp : arr) {
            System.out.println(Arrays.toString(tmp));
        }
    }

    private static int[][] jumlah(int[][] mat1, int[][] mat2) {
        int row1 = mat1.length;
        int col1 = mat1[0].length;

        int row2 = mat2.length;
        int col2 = mat2[0].length;

        int[][] res = new int[row1][col1];
        if (row1 != row2 && col1 != col2) {
            System.out.println("Matrix tidak berordo sama, tidak bisa melakukan operasi jumlah");
            return res;
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return res;
    }

    private static int[][] kali(int[][] mat1, int[][] mat2) {
        int row1 = mat1.length;
        int col1 = mat1[0].length;

        int row2 = mat2.length;
        int col2 = mat2[0].length;

        int[][] res = new int[row1][col2];

        if (row2 != col1) return res;

        int tmp;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                tmp = 0;
                for (int k = 0; k < col1; k++) {
                    tmp += mat1[i][k] * mat2[k][j];
                }
                res[i][j] = tmp;
            }
        }
        return res;
    }
}

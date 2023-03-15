package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //array in java can contain different size arrays
        int[][] arr;

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,2,1};

        arr = new int[][]{
                arr1,
                arr2
        };

        System.out.println(Arrays.deepToString(arr));

        int[][] arr3 = {
                {4,5,6},
                {4,3,2,1}
        };

        System.out.println(Arrays.deepToString(arr3));
        

    }
}

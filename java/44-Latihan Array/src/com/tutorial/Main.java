package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //sort terbalik, operasi tambah dua buah array, append dua buah array
        int[] arr1 = {5,7,1,2,3,5,6,4,9,7};
        int[] arr2 = {1,5,9,4};

        //sort terbalik
        System.out.println("sort terbalik");
        System.out.println("arr: " + Arrays.toString(arr1));
        System.out.println(Arrays.toString(kebalik(arr1)));
        System.out.println();

        //operasi tambah
        System.out.println("operasi tambah");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println(Arrays.toString(tambah(arr1,arr2)));
        System.out.println();

        //concat
        System.out.println("concat");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println(Arrays.toString(concat(arr1,arr2)));
        System.out.println();

    }

    private static int[] kebalik (int[] arr) {
        int len = arr.length;
        int[] res = Arrays.copyOf(arr, arr.length);

        Arrays.sort(res);
        for (int i = 0; i < len/2; i++) {
            res[i] ^= res[len-i-1];
            res[len-i-1] ^= res[i];
            res[i] ^= res[len-i-1];
        }

        return res;
    }

    private static int[] tambah (int[] arr1, int[] arr2) {
        int[] res;

        if (arr1.length > arr2.length) {
            res = Arrays.copyOf(arr1, arr1.length);

            for (int i = 0; i < arr2.length; i++) {
                res[i] += arr2[i];
            }
        } else {
            res = Arrays.copyOf(arr2, arr2.length);

            for (int i = 0; i < arr1.length; i++) {
                res[i] += arr1[i];
            }
        }
        return res;
    }

    private static int[] concat (int[] arr1, int[] arr2) {

        int[] res = Arrays.copyOf(arr1, arr1.length + arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length+i] = arr2[i];
        }

        return res;
    }
}

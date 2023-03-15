package com.tutorial;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //assign array
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("assigned array: " + Arrays.toString(nums));
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
        System.out.println("nums[3] = " + nums[3]);
        System.out.println("nums[4] = " + nums[4]);
        System.out.println();
        float[] floats = new float[4];
        System.out.println("declared array: " + Arrays.toString(floats));
        System.out.println("floats[0] = " + floats[0]);
        System.out.println("floats[1] = " + floats[1]);
        System.out.println("floats[1] = " + floats[2]);
        System.out.println("floats[1] = " + floats[3]);

        floats[1] = 1.1f;
        System.out.println("Set index 2 to " + floats[1]);
        System.out.println("floats: " + Arrays.toString(floats));
        
    }
}

package com.partho;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {18, 12, 19, 13, 17, 15, 14};
        maxValue(arr);
    }

    static void maxValue(int[] arr2){
        int max = arr2[0];

        for (int j : arr2) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}

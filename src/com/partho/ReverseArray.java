package com.partho;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr2) {

        int start = 0;
        int end = arr2.length - 1;

        while (start < end) {
            swap(arr2, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr3, int index1, int index2) {
        int temp = arr3[index1];
        arr3[index1] = arr3[index2];
        arr3[index2] = temp;
    }
}

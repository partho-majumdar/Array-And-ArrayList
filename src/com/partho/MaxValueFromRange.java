package com.partho;

public class MaxValueFromRange {
    public static void main(String[] args) {
        int[] arr = {133, 18, 14, 20, 69, 31, 22, 29, 27, 333};

        int ans = maxRange(arr, 2, 7);
        System.out.println(ans);
    }

    static int maxRange(int[] arr2, int start, int end) {

        int maxValue = arr2[start];

        for (int i = start; i <= end; i++) {
            if (arr2[i] > maxValue) {
                maxValue = arr2[i];
            }
        }
        return maxValue;
    }
}

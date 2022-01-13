package com.partho;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {19, 18, 17, 16, 15, 14, 13, 12, 11};
    }

    static void reverse(int arr2[], int start, int end) {
    }

    static void swap(int[] arr3, int index1, int index2) {
        int temp = arr3[index1];
        arr3[index1] = arr3[index2];
        arr3[index2] = temp;
    }
}















/*
     public static void main(String[] args) {

        int[] arr = {17, 15, 23, 19, 18, 56};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
*/
package com.partho;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.print("Enter any 5 number: ");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

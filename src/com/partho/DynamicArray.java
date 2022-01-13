package com.partho;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {

        // syntax
        // ArrayList<Integer> list = new Arraylist<>(10) --> here 10 is initial value, but it doesn't even matter we can put any number of element

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(list.contains(5));
        System.out.println(list.set(0,11));
        System.out.println(list);
        System.out.println(list.get(4));
    }
}

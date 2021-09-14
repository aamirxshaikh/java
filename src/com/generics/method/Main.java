package com.generics.method;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        String[] names = {"abc", "xyz"};
        Boolean[] booleans = {true, false};

        display(integers);
        display(names);
        display(booleans);
    }

    static <T> void display (T[] value) {
        for (T val: value) {
            System.out.println(val);
        }
    }
}

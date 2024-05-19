package com.method_parameters;

public class Main {
    public static void main(String[] args) {
        int i = 10;

        int result = add(10, 10, i);

        System.out.println(result);
    }

    public static int add (int a, int b, int i) {
        i = 20;

        return a + b + i;
    }
}

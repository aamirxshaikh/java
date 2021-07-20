package com.static_methods;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.value);
        System.out.println(Main.getNumber(22));

        System.out.println(value);
        System.out.println(getNumber(20));
    }

    public static int value = 19;

    public static int getNumber (int number) {
        return number;
    }
}

package com.static_methods_and_variables;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.value);
        System.out.println(Main.getNumber(22));

        System.out.println(value);
        System.out.println(getNumber(20));

        Main.set();

        System.out.println(nonStatic);
    }

    public static int value = 19;
    public int nonStatic = 1;

    public static int getNumber (int number) {
        return number;
    }

    public static void set () {
        nonStatic = value;
    }
}

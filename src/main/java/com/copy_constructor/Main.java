package com.copy_constructor;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("Item 1", 1);

        Item i2 = new Item(i1);

        System.out.println(i1);

        System.out.println(i1.name);
        System.out.println(i1.id);

        System.out.println();

        System.out.println(i2);

        System.out.println(i2.name);
        System.out.println(i2.id);
    }
}

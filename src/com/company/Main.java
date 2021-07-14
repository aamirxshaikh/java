package com.company;

public class Main {

    public static void main(String[] args) {
        Item i1 = new Item("1");
        Item i2 = i1;

        System.out.println("i1 = " + i1.title + " i2 = " + i2.title);

        i1.title = "i1 change";
        i2.title = "i2 change";

        System.out.println("i1 = " + i1.title + " i2 = " + i2.title);
    }

    static class Item {
        String title;

        Item(String title) {
            this.title = title;
        }
    }
}

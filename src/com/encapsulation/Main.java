package com.encapsulation;

public class Main {
    public static void main(String[] args) {
        Item i = new Item("Item 1", "Type 1", 1101, true);

        i.setName("Item updated");
        i.setType("Type updated");
        i.setId(201);
        i.setAvailable(true);

        System.out.println(i.getName());
    }
}

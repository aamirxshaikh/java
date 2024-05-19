package com.copy_objects;

public class Item {
    String name;
    int id;

    Item (String name, int id) {
        this.name = name;
        this.id = id;
    }

    void copy (Item i1) {
        this.name = i1.name;
        this.id = i1.id;
    }
}

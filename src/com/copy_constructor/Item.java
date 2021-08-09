package com.copy_constructor;

public class Item {
    String name;
    int id;

    Item (String name, int id) {
        this.name = name;
        this.id = id;
    }

    Item (Item i1) {
        this.copy(i1);
    }

    void copy (Item i1) {
        this.name = i1.name;
        this.id = i1.id;
    }
}

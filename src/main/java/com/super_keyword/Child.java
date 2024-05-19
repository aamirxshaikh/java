package com.super_keyword;

public class Child extends Parent {
    String name;
    int age;

    Child (String surname, String name, int age) {
        super(surname);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getFields () {
        return super.getFields() + " " + this.name + " " + this.age;
    }
}

package com.inheritance_super;

public class Parent {
    protected final String surname;

    Parent (String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        Child c = new Child();

        // c.surname = "New surname"; // cannot modify final variable

        System.out.println(c.surname);
    }
}

class Child extends Parent {
    Child () {
        super("Shaikh");
    }
}
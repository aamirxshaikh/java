package com.inheritance_super;

public class Parent {
    String surname;

    Parent (String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.surname);
    }
}

class Child extends Parent {
    Child () {
        super("Shaikh");
    }
}
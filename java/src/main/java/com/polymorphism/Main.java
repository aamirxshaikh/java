package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.print();
        c.print();
    }
}

class Parent {
    public void print () {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void print () {
        System.out.println("Child");
    }
}
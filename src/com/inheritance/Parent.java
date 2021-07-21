package com.inheritance;

public class Parent {
    String surname = "Shaikh";

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.name +  " " + c.surname + " " + c.randomNumber());
    }

    int randomNumber () {
        return (int) (Math.random() * ((100 - 1) + 1)) + 1;
    }
}

class Child extends Parent {
    String name = "Aamir";
}
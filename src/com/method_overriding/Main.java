package com.method_overriding;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.display();
        c.display();
    }
}

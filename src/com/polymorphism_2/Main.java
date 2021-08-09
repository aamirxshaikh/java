package com.polymorphism_2;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        Laptop l = new Laptop();

        Device[] objs = {p, l};

        for (Device obj : objs) {
            obj.name();
        }
    }
}

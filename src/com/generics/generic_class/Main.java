package com.generics.generic_class;

public class Main {
    public static void main(String[] args) {
        Generic <Integer, Integer> generic = new Generic<>(10, 100);

        System.out.println(generic.getValue1());
        System.out.println(generic.getValue2());
    }
}

package com.generics.generic_class;

public class Main {
    public static void main(String[] args) {
        Generic <Character, String> generic = new Generic<>('a', "abc");

        System.out.println(generic.getValue1());
        System.out.println(generic.getValue2());
    }
}

package com.access_modifiers.default_modifier.same_package;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        com.access_modifiers.default_modifier.different_package.Child dc = new com.access_modifiers.default_modifier.different_package.Child();

        System.out.println(c);
        System.out.println(dc);
    }
}

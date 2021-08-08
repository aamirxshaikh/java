package com.access_modifiers.public_modifier.same_package;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();

        com.access_modifiers.public_modifier.different_package.Child dc = new com.access_modifiers.public_modifier.different_package.Child();

        System.out.println(c.name);
        System.out.println(dc.name);
    }
}

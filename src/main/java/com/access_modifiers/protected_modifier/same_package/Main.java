package com.access_modifiers.protected_modifier.same_package;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        com.access_modifiers.protected_modifier.different_package.Child dc = new com.access_modifiers.protected_modifier.different_package.Child();

        System.out.println(c.name);
        System.out.println(c.getName());

        System.out.println(dc.name);
    }
}

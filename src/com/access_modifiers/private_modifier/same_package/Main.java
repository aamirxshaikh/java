package com.access_modifiers.private_modifier.same_package;

public class Main {
    private static String p = "Private"; // Accessible

    public static void main(String[] args) {
        Child c = new Child();
        com.access_modifiers.private_modifier.different_package.Child dc = new com.access_modifiers.private_modifier.different_package.Child();

        System.out.println(c.name); // Not accessible
        System.out.println(dc.name); // Not accessible

        System.out.println(p); // Accessible
    }
}

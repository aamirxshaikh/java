package com.super_keyword;

public class Main {
    public static void main(String[] args) {
        Child c = new Child("xyz", "Aamir",  21);

//        System.out.println(c.surname + " " + c.name + " " + c.age);

        Parent p = new Parent("xyz");

//        System.out.println(p.surname);
//
//        System.out.println(c.surname);

        System.out.println(c.getFields());
        System.out.println(p.getFields());

        System.out.println(c.surname);
    }
}

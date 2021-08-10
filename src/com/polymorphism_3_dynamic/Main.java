package com.polymorphism_3_dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Device device;

        System.out.println("Enter your choice : ");
        System.out.print("1 : Phone  2 : Laptop");

        System.out.println();

        int choice = sc.nextInt();

        if (choice == 1) {
            device = new Phone();

            System.out.println("Phone");

            device.price();
        } else if (choice == 2) {
            device = new Laptop();

            System.out.println("Laptop");

            device.price();
        } else {
            System.out.println("Invalid choice");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name");
        String name = sc.nextLine();

        System.out.println("Enter product price");
        int price = sc.nextInt();

        System.out.println("Discount ? (specify using true/false)");
        boolean discount = sc.nextBoolean();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float priceAfterDiscount = (float) 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name");
        String name = sc.nextLine();

        System.out.println("Enter product price");
        int price = sc.nextInt();

        System.out.println("Discount ? (specify using true/false)");
        boolean discount = sc.nextBoolean();

        if (discount) {
            System.out.println("Enter %");
            float percent = sc.nextFloat();

            priceAfterDiscount = (price - (1/percent) * price);
        }

        System.out.println("Product : " + "'" + name + "'" + " Price before discount : " + price + " after discount : " + priceAfterDiscount);
    }
}

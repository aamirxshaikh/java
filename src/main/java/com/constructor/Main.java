package com.constructor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Product 1", "Accessories", LocalDate.of(2020, 3,  3), 50, true);
        Product p2 = new Product("Product 2", "Accessories",50, true);
        System.out.println(p1.name);
        System.out.println(p1.dateOfManufacture);
        System.out.println(p1);
        System.out.println(p2);
    }

    static class Product {
        String name;
        String type;
        LocalDate dateOfManufacture;
        int price;
        boolean isAvailable;

        Product(String name, String type, LocalDate dateOfManufacture, int price, boolean isAvailable) {
            this.name = name;
            this.type = type;
            this.dateOfManufacture = dateOfManufacture;
            this.price = price;
            this.isAvailable = isAvailable;
        }

        Product(String name, String type, int price, boolean isAvailable) {
            this.name = name;
            this.type = type;
            this.price = price;
            this.isAvailable = isAvailable;
        }

        public String toString () {
            return this.dateOfManufacture + " " + this.name + " " + this.type + " " + this.price + " " + this.isAvailable;
        }
    }
}

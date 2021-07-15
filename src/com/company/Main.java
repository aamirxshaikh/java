package com.company;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date sql = new java.sql.Date(3);

        int [] items = {1, 2, 3, 4, 5, 10, 20, 22};

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        for (int item : items) {
            System.out.println(item);
        }

        Arrays.stream(items).forEach(System.out::println);

        System.out.println(sql);
    }
}

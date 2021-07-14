package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date sql = new java.sql.Date(3);

        System.out.println(sql);
    }
}

package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalTime.now().getHour());
    }
}

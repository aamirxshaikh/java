package com.enums;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Gender male = Gender.MALE;
    Gender female = Gender.FEMALE;

    System.out.println(male);
    System.out.println(female);

    System.out.println(Arrays.toString(Days.values()));

    Days day = Days.valueOf("MONDAY");
    System.out.println("day = " + day);

    int ordinalValue = Days.FRIDAY.ordinal(); // Returns 4
    System.out.println("ordinalValue = " + ordinalValue);

    System.out.println(Season.SPRING.getTemperature());
  }
}

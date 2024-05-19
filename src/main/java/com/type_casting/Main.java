package com.type_casting;

public class Main {
  public static void main(String[] args) {
    // static type casting

    int myInt = 10;
    long myLong = myInt;

    System.out.println(myLong);

    // dynamic type casting

    long myLong2 = 10;
    int myInt2 = (int) myLong2;

    System.out.println(myLong2);
  }
}

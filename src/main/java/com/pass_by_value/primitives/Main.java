package com.pass_by_value.primitives;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    modifyPrimitive(x);
    System.out.println(x); // Output: 10
  }

  static void modifyPrimitive(int value) {
    value = 20; // Changes made here do not affect the original value
  }
}

package com.pass_by_value.objects;

public class Main {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Hello");
    modifyObjectReference(str);
    System.out.println(str); // Output: Hello World
  }

  static void modifyObjectReference(StringBuilder value) {
    value.append(" World"); // Changes made to the object are reflected outside the method
  }
}

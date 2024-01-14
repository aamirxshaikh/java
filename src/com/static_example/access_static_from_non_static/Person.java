package com.static_example.access_static_from_non_static;

public class Person {
  // Static variable
  private static Boolean isHuman = true;

  // Static method
  public static void staticMethod() {
    System.out.println("Static method");
  }

  // Non-static method
  public void nonStaticMethod() {
    // Accessing static variable
    System.out.println(isHuman);

    // Invoking static method
    staticMethod();
  }
}

package com.static_example.access_non_static_from_static;

public class Person {
  // Non-static variable
  private int nonStaticVar;

  // Non-static method
  public void nonStaticMethod() {
    System.out.println("Non-static method");
  }

  // Static method
  public static void staticMethod() {
    // Cannot directly access non-static variable or method
    // Uncommenting the next line will result in a compilation error
    // System.out.println(nonStaticVar);

    // Uncommenting the next line will result in a compilation error
    // nonStaticMethod();

    // Creating an instance to access non-static members or methods
    Person p = new Person();
    System.out.println(p.nonStaticVar);
    p.nonStaticMethod();
  }
}

package com.static_example.access_static_from_non_static;

public class Main {
  public static void main(String[] args) {
    Person p = new Person();

    p.nonStaticMethod();

    System.out.println(p);
  }
}

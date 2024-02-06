package com.type_inference;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    var name = "Aamir";
    var names = new String[]{"Foo", "bar"};
    var age = 24;

    System.out.println("name = " + name);
    System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    System.out.println("age = " + age);
  }
}

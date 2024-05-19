package com.objects;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("Aamir");

    Person person1 = person;

    person1.setName("Aamir Shaikh");

    System.out.println("person " + person);
    System.out.println("person 1 " + person1);
  }
}

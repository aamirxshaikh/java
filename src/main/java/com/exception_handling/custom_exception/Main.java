package com.exception_handling.custom_exception;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println(divide(10, 0));
    } catch (UncheckedException e) {
      System.out.println(e.getMessage());
    } catch (CheckedException e) {
      System.out.println(e.getMessage());
    }

  }

  private static int divide(int a, int b) throws CheckedException {
    if (b == 0) {
      throw new CheckedException("Cannot divide by 0");
    }

    return a / b;
  }
}

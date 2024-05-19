package com.exception_handling.compiletime_exception;

import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {

    try {
      File file = new File("foo.txt");

      if (!file.exists()) {
        file.createNewFile();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

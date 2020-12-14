package com.example;

public class ExposedLibrary {
  public String getString() {
    return "ExposedLibrary";
  }

  public static String getStaticString() {
    return "static ExposedLibrary";
  }
}

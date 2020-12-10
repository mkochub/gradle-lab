package com.example;

public class PublicLibrary {
  public static String getString() {
    return SecretClass.secretString() + " from Public Library";
  }

  public static ExposedLibrary getExposed() {
    return new ExposedLibrary();
  }
}

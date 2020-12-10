package com.example;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;

public class Main {

  public static void main(String[] args) throws IOException {
    MyService myService = new MyService();
    JsonNode jsonResponse = myService.getWebPage("https://reqres.in/api/users");
    System.out.println(jsonResponse.toPrettyString());
  }
}

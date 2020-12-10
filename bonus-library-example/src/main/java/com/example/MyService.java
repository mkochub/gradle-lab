package com.example;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

public class MyService {

  private ObjectMapper objectMapper = new ObjectMapper();

  public JsonNode getWebPage(String url) throws IOException {
    HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
    HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(url));
    String response =  request.execute().parseAsString();
    return objectMapper.readValue(response, JsonNode.class);
  }
}

package com.session1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondApp extends App  {
  String name = "Ahmed";
  int age = 10;
  String familyName = "Sassi";

  @Override
  void test(App app) {
  }
      public static void main(String[] args) {
        SecondApp secondApp = new SecondApp();
        App app = secondApp;
        System.out.println(secondApp.name);
        
      }
}

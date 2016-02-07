package com.codurance.xstartup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, "--server.port=3434");
  }
}

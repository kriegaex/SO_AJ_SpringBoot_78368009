package com.example.helloworld;

import com.example.helloworld.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class HelloWorldApplication {
  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }
}

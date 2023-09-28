package com.calculator.arithmetic_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ArithmeticCalculatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(ArithmeticCalculatorApplication.class, args);
  }
}

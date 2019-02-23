package com.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuration
@Configuration
public class config {

  @Bean(name = "typical")
  public CalculatorInterface getService(){

    return new CalculatorInterfaceImplement();
  }

}

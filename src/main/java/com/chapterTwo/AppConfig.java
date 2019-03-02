package com.chapterTwo;

import org.springframework.context.annotation.Bean;

public class AppConfig {
  @Bean(name="calc")
  public CalculatorServiceImpl getService(){
    return new CalculatorServiceImpl();
  }
}

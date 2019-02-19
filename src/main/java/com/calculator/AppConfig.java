package com.calculator;


public class AppConfig {

  public CalculatorInterface getService()
  {
    return new CalculatorServiceImpl();
  }
}

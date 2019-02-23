package com.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

  @Test
  public void add() {
    Calculator calculator = new Calculator();
    int result =calculator.add(2,3);
    Assert.assertEquals(5,result);
  }

}
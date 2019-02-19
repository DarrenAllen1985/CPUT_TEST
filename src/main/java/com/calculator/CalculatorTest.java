package com.calculator;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class CalculatorTest {
  private CalculatorInterface calc;

  @BeforeMethod
  public void setup()throws Exception{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig);
    calc = (CalculatorInterface)ctx.getBean("calc");}

    @AfterMethod
    public void tearDown() throws Exception{

    }

    @test
    public void testAdd() throws Exception{
      int results = calc.add(5,5);
      Assert.assertEquals(results,10,"Sum of two numbers 5+5 is 10")

    }
}

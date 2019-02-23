package com.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CalculatorInterfaceTest {

  public void add(){
    CalculatorInterface im =new CalculatorInterfaceImplement();
    int res =  im.add(2,4);
    Assert.assertEquals(14,res);

  }

  @Test
  public void name() {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CalculatorInterfaceImplement.class);
    CalculatorInterface calculatorInterface = (CalculatorInterface)applicationContext.getBean("typical");

    int result = calculatorInterface.add(3,1);
    Assert.assertEquals(12 , result);
  }
}
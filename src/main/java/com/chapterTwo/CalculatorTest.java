package com.chapterTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTest {

    private calculatorInterface calc;

    public void setUp() throws Exception {
      ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
      calc = (calculatorInterface)ctx.getBean("calc");
}}

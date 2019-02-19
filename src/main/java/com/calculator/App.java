package com.calculator;

import org.springframework.util.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @test
    public void add()
    {
        CalculatorInterface calc = new CalculatorServiceImpl();
        int results =calc.add(10,2)
        Assert.assertEquals("Add 2+3",30);

    }
}

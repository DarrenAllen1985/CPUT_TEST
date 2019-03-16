package com.example.demo.ooprinciples;

import com.example.demo.DemAppTests;
import com.example.demo.oo.principles.CarColour;
import org.junit.Assert;
import org.junit.Test;

public class InheritanceTests extends DemAppTests {

    @Test
    public void testInheritance() {
        CarColour carColour = new CarColour();
        carColour.setValue("458");
        carColour.setenforUpperC(true);


        System.out.println("#################################################");
        System.out.println(carColour.getValue().equals("458".toUpperCase()));
        assert carColour.getValue().equals("458".toUpperCase());
        Assert.assertEquals(true, carColour.getValue().equals("458".toUpperCase()));
        System.out.println("#################################################");
    }
}

package com.example.demo.ooprinciples;

import com.example.demo.DemAppTests;
import com.example.demo.oo.principles.CarWrap;
import org.junit.Assert;
import org.junit.Test;

public class CompositionTests extends DemAppTests {

    @Test
    public void testComposition() {
        CarWrap carWrap = new CarWrap("Farrari", "458");

        assert carWrap.getCarName().equals("Farrari");
        assert carWrap.getCarColour().equals("458");

        System.out.println("#################################################");
        System.out.println(carWrap.getCarName().equals("Farrari"));
        assert carWrap.getCarColour().equals("458");
        Assert.assertEquals(true, carWrap.getCarColour().equals("458"));
        System.out.println("#################################################");

    }
}

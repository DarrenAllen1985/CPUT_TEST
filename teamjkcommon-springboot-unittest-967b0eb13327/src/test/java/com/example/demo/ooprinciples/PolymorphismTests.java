package com.example.demo.ooprinciples;

import com.example.demo.DemAppTests;
import com.example.demo.oo.principles.CarName;
import com.example.demo.oo.principles.CarColour;
import org.junit.Assert;
import org.junit.Test;

public class PolymorphismTests extends DemAppTests {

    @Test
    public void testPolymorphism() {
        CarName carName = new CarName();
        CarColour carColour = new CarColour();
        CarName poly = carColour;

        carName.setValue("Farrari");
        carColour.setValue("458");

        assert carName.getType().equals("Lamborgini");
        assert carColour.getType().equals("Hurrican");
        assert poly.getType().equals("Hurrican");

        System.out.println("#################################################");
        System.out.println(poly.getType().equals("Hurrican"));
        assert poly.getType().equals("Hurrican");
        Assert.assertEquals(true,poly.getType().equals("Hurrican"));
        System.out.println("#################################################");
    }
}

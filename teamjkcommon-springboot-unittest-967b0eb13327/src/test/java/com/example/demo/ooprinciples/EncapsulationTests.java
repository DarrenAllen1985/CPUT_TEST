package com.example.demo.ooprinciples;

import com.example.demo.DemAppTests;
import com.example.demo.oo.principles.CarName;
import org.junit.Assert;
import org.junit.Test;

public class EncapsulationTests extends DemAppTests {

    @Test
    public void testEncapsulation() {
        CarName carName = new CarName();
        carName.setenforUpperC(true);
        carName.setValue("Farrari");

        System.out.println("#####################################");
        System.out.println(carName.getValue().equals("Farrari".toUpperCase()));
        Assert.assertEquals(true, carName.getValue().equals("Farrari".toUpperCase()));
        assert carName.getValue().equals("Farrari".toUpperCase());
        System.out.println("#####################################");
    }
}

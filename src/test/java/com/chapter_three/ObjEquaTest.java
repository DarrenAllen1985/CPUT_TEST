package com.chapter_three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjEquaTest {

  @Test
  public void main() {
    ObjEquaIntImp xx = new ObjEquaIntImp();
    String rslt = xx.CarDetails("Bugatti","1600");
    Assert.assertEquals("Bugatti Capacity is 1600",rslt);
  }
}
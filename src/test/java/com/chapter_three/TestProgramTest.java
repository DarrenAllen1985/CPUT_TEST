package com.chapter_three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestProgramTest {

  //Program no1
  @Test
  public void add(){
    TestProgramInterface tpAddNeg = new TestProgramInterfaceImpl();
    int results = tpAddNeg.add(7,8);
    Assert.assertEquals(15,results);
  }
  //Program no2
  @Test
  public void addNeg() {
    TestProgramInterface tpAddNeg = new TestProgramInterfaceImpl();
    int results = tpAddNeg.add(7,-8);
    Assert.assertEquals(15,results);
  }

  //Program no3 with negatives
  @Test
  public void subtract() {
    TestProgramInterface tpSub = new TestProgramInterfaceImpl();
    int results = tpSub.Subtract(18 , 11);
    Assert.assertEquals(7,results);
  }
  //Program no4 with negatives
  @Test
  public void subtractNeg() {
    TestProgramInterface tpSubNeg = new TestProgramInterfaceImpl();
    int results = tpSubNeg.Subtract(18 , -11);
    Assert.assertEquals(7,results);
  }
  //Program no5
  @Test
  public void mulltiply()
  {
    TestProgramInterface tpMulti = new TestProgramInterfaceImpl();
    int results = tpMulti.Mulltiply(2,5);
    Assert.assertEquals(10,results);
  }

  //Program no6
  @Test
  public void mulltiplyNeg()
  {
    TestProgramInterface tpMulti = new TestProgramInterfaceImpl();
    int results = tpMulti.Mulltiply(2,-5);
    Assert.assertEquals(10,results);
  }

  //Program no7
  @Test
  public void devide() {
    TestProgramInterface tpDevide = new TestProgramInterfaceImpl();
    int results = tpDevide.Devide(2,5);
    Assert.assertEquals(10,results);
  }

  //Program no8
  @Test
  public void devideNeg() {
    TestProgramInterface tpDevide = new TestProgramInterfaceImpl();
    int results = tpDevide.Devide(2,-5);
    Assert.assertEquals(15,results);
  }
}
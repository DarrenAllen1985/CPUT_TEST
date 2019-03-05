package com.chapter_three;

public class ObjEquaIntImp implements objEquaInt{

  @Override
  public String CarDetails(String CarName, String EnginSize) {
    return CarName + " Capacity is " + EnginSize;
  }
}

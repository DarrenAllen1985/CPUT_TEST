package com.chapter_three;

public class TestProgramInterfaceImpl implements TestProgramInterface {
  @Override
  public int add(int a, int b) {
    return Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b));
  }

  @Override
  public int Subtract(int a, int b) {
    return Integer.parseInt(String.valueOf(a)) - Integer.parseInt(String.valueOf(b));
  }

  @Override
  public int Mulltiply(int a, int b) {
    return Integer.parseInt(String.valueOf(a)) * Integer.parseInt(String.valueOf(b));
  }

  @Override
  public int Devide(int a, int b) {
    return Integer.parseInt(String.valueOf(a)) / Integer.parseInt(String.valueOf(b));
  }
}
